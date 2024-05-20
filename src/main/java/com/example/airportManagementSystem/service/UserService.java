package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User getOneUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public User saveOneUser(User newUser) {
        return userRepository.save(newUser);
    }
}
