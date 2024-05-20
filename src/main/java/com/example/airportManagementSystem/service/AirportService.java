package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.entity.Airport;
import com.example.airportManagementSystem.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AirportService {
    private final AirportRepository airportRepository;

    public Airport saveAirport(Airport airport) {
        return airportRepository.save(airport);
    }

}
