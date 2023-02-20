package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.UserDto;

public interface UserService {
    UserDto save(UserDto userDto);

    String login(UserDto userDto);

}
