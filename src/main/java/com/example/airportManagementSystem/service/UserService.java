package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User saveUser(UserDto userDto) {
        User user = new User();
        user.setPassword(userDto.getPassword());
        user.setName(userDto.getName());
        user.setMail(userDto.getMail());
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
