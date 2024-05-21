package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.dto.FlightScheduleDto;
import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.service.FlightScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/flightSchedule")
public class FlightScheduleController {
    private final FlightScheduleService flightScheduleService;

    @PostMapping("/save")
    public ResponseEntity<FlightSchedule> saveFlightSchedule(@RequestBody FlightScheduleDto flightScheduleDto) {
        FlightSchedule flightSchedule = flightScheduleService.saveFlightSchedule(flightScheduleDto);
        return ResponseEntity.ok(flightSchedule);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<FlightSchedule>> findAll() {
        List<FlightSchedule> flightSchedules = flightScheduleService.findAll();
        return ResponseEntity.ok(flightSchedules);
    }

    @GetMapping("/flights/{id}")
    public ResponseEntity<FlightSchedule> getFlightScheduleById(@PathVariable int id) {
        FlightSchedule flightById = flightScheduleService.getFlightById(id);
        return ResponseEntity.ok(flightById);
    }

    @GetMapping("/search")
    public ResponseEntity<List<FlightSchedule>> searchFlights(@RequestParam String departure, @RequestParam String arrival, @RequestParam LocalDate date) {
        List<FlightSchedule> flightSchedules = flightScheduleService.searchFlights(date, arrival, departure);
        return ResponseEntity.ok(flightSchedules);
    }
    @GetMapping("/price/asc")
    public ResponseEntity<List<FlightSchedule>> getFlightSortedByPriceAsc(){
        List<FlightSchedule> flightSchedules = flightScheduleService.getAllFlightsSortedByPriceAsc();
        return ResponseEntity.ok(flightSchedules);
    }
    @GetMapping("price/desc")
    public ResponseEntity<List<FlightSchedule>> getFlightSortedByPriceDesc(){
        List<FlightSchedule> flightSchedules = flightScheduleService.getAllFlightsSortedByPriceDesc();
        return ResponseEntity.ok(flightSchedules);
    }
}
