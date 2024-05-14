package com.example.airportManagementSystem.dto;


import com.example.airportManagementSystem.entity.Role;
import lombok.Builder;

import java.util.Set;

@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Set<Role> authorities
) {
}
