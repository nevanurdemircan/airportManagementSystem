package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.request.SignUpRequest;

public interface AuthService {
    UserDto createUser(SignUpRequest signUpRequest);
    UserDto getAuthUser();
}
