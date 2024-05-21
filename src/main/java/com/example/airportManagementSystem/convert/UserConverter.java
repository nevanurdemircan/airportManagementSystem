package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.request.SignUpRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserDto convertToUserDto(User user){
        UserDto dto = new UserDto();
        dto.setPassword(user.getPassword());
        dto.setName(user.getName());
        dto.setMail(user.getMail());
        return dto;
    }
    public User SignUpRequestConvertToUser(SignUpRequest signUpRequest){
        User user = new User();
        user.setPassword(new BCryptPasswordEncoder().encode(signUpRequest.getPassword()));
        user.setName(signUpRequest.getName());
        user.setMail(signUpRequest.getMail());
        return user;
    }
}
