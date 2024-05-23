package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.convert.FlightScheduleConverter;
import com.example.airportManagementSystem.convert.ReservationConverter;
import com.example.airportManagementSystem.dto.FlightScheduleDto;
import com.example.airportManagementSystem.dto.ReservationDto;
import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.entity.Reservation;
import com.example.airportManagementSystem.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/reservations")
public class ReservationController {
    private final ReservationService reservationService;
    private final FlightScheduleConverter flightScheduleConverter;
    private final ReservationConverter reservationConverter;

    @PostMapping("/create")
    public ResponseEntity<Reservation> create(ReservationDto reservationDto) {
        Reservation reservation = reservationService.create(reservationDto);
        return ResponseEntity.ok(reservation);
    }

    @GetMapping("/user/{userId}/flights")
    public ResponseEntity<List<FlightScheduleDto>> getUserFlights(@PathVariable int userId) {
        List<FlightSchedule> userFlight = reservationService.findUserFlights(userId);
        List<FlightScheduleDto> userFlightDtos = userFlight.stream()
                .map(flightScheduleConverter::flightScheduleConvertToFlightScheduleDto)
                .collect(Collectors.toList());

        return ResponseEntity.ok(userFlightDtos);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ReservationDto>> getAll() {
        List<Reservation> all = reservationService.getAll();
        List<ReservationDto> reservationDtos = all.stream()
                .map(reservationConverter::convertToReservationDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(reservationDtos);
    }
}
