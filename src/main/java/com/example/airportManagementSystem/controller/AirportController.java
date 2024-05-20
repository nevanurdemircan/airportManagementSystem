package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.entity.Airport;
import com.example.airportManagementSystem.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/airport")
public class AirportController {
    private final AirportService airportService;

    @PostMapping("/save")
    public Airport saveAirport(@RequestBody Airport airport){
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        return airportService.saveAirport(airport);
    }
}
