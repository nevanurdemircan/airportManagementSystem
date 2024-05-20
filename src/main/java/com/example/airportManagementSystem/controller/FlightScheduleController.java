package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.service.FlightScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/flightSchedule")
public class FlightScheduleController {
    private final FlightScheduleService flightScheduleService;

    @PostMapping("/save")
    public FlightSchedule saveFlightSchedule(@RequestBody FlightSchedule flightSchedule){
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        return flightScheduleService.saveFlightSchedule(flightSchedule);
    }
}
