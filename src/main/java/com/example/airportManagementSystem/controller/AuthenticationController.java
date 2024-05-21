package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.request.AuthenticationRequest;
import com.example.airportManagementSystem.request.SignUpRequest;
import com.example.airportManagementSystem.response.AuthenticationResponse;
import com.example.airportManagementSystem.service.AuthService;
import com.example.airportManagementSystem.service.UserDetailServiceImpl;
import com.example.airportManagementSystem.util.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthService authService;
    private final AuthenticationManager authenticationManager;
    private final UserDetailServiceImpl userDetailService;
    private final JwtUtil jwtUtil;

    @PostMapping("login")
    public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest, HttpServletResponse response) throws BadCredentialsException, DisabledException, UsernameNotFoundException, IOException {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getMail(), authenticationRequest.getPassword()));

        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Yanlış kullanıcı adı ya da parola");
        } catch (DisabledException disabledException) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Kullanıcı oluşturulamadı, önce kullanıcıyı kaydedin.");
            return null;

        }
        final UserDetails userDetails = userDetailService.loadUserByUsername(authenticationRequest.getMail());
        final String jwt = jwtUtil.generateToken(userDetails.getUsername());
        return new AuthenticationResponse(jwt);
    }

    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody SignUpRequest signUpRequest) {
        UserDto createdUser = authService.createUser(signUpRequest);
        if (createdUser == null) {
            return new ResponseEntity<>("user oluşturulamadı tekrar deneyin.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
