package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.dto.CreateUserRequest;
import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @PostMapping("/addNewUser")
    public User addUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping("/loginUser")
    public String getUserString() {
        return "giriş başarılı";
    }

    @GetMapping("/loginAdmin")
    public String getAdminString() {
        return "giriş başarılı";
    }

}
