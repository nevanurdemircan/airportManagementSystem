package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.repository.UserRepository;
import com.example.airportManagementSystem.security.JwtUserDetails;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        return JwtUserDetails.create(user);
    }
    public UserDetails loadUserById(Long id) {
        User user = userRepository.findById(Math.toIntExact(id)).get();
        return JwtUserDetails.create(user);
    }
}
