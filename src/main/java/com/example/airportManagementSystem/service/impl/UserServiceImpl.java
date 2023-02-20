package com.example.airportManagementSystem.service.impl;

import com.example.airportManagementSystem.convert.UserConverter;
import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.repository.UserRepository;
import com.example.airportManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    @Override
    public UserDto save(UserDto userDto) {
        User user = userConverter.UserDtoConvertToUser(userDto);
        user = userRepository.save(user);
        return userConverter.UserConvertToUserDto(user);
    }
    @Override
    public String login(UserDto userDto) {
        User user =  userRepository.findByName(userDto.getName());
        if(user==null){
            return "kullanıcı bulunamadı";
        }if(user.getPassword()==userDto.getPassword()){
            return "giriş yapıldı";
        }else{
            return "şifre yanlış";
        }
    }
}
