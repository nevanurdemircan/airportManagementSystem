package com.example.airportManagementSystem.dto;

import com.example.airportManagementSystem.entity.Rol;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private String password;
    private Rol rol;
}
