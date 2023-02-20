package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserDto UserConvertToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setRol(user.getRol());
        userDto.setName(user.getName());
        return userDto;
    }
    public User UserDtoConvertToUser(UserDto userDto){
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRol(userDto.getRol());
        user.setName(userDto.getName());
        return user;
    }
}
