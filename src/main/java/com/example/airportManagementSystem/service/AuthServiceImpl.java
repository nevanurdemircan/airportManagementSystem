package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.convert.UserConverter;
import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.repository.UserRepository;
import com.example.airportManagementSystem.request.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final UserConverter converter;

    @Override
    public UserDto createUser(SignUpRequest signUpRequest) {
        User user = converter.SignUpRequestConvertToUser(signUpRequest);
        User savedUser = userRepository.save(user);

        UserDto savedUserDto = converter.convertToUserDto(savedUser);
        return savedUserDto;
    }

    @Override
    public UserDto getAuthUser() {
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        User user = userRepository.findFirstByMail(principal.getUsername());
        UserDto userDto = converter.convertToUserDto(user);
        return userDto;
    }
}
