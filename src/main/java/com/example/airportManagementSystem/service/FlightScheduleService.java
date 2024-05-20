package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.repository.FlightScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlightScheduleService {
    private final FlightScheduleRepository flightScheduleRepository;

    public FlightSchedule saveFlightSchedule(FlightSchedule flightSchedule){
        return flightScheduleRepository.save(flightSchedule);
    }
}
