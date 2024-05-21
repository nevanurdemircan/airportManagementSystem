package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.entity.Airport;
import com.example.airportManagementSystem.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/airport")
public class AirportController {
    private final AirportService airportService;

    @PostMapping("/save")
    public ResponseEntity<Airport> saveAirport(@RequestBody Airport airport){
        Airport resultAirport = airportService.saveAirport(airport);
        return ResponseEntity.ok(resultAirport);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Airport>> findAllAirport(){
        List<Airport> all = airportService.findAll();
        return ResponseEntity.ok(all);
    }
}
