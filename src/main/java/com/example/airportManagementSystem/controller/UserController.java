package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.dto.UserDto;
import com.example.airportManagementSystem.entity.User;
import com.example.airportManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody UserDto userDto) {
        User user = userService.saveUser(userDto);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}
