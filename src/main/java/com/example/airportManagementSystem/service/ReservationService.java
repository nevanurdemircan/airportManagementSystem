package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.convert.ReservationConverter;
import com.example.airportManagementSystem.dto.ReservationDto;
import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.entity.Reservation;
import com.example.airportManagementSystem.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final ReservationConverter reservationConverter;

    public Reservation create(ReservationDto reservationDto) {
        Reservation reservation = reservationConverter.convertToReservation(reservationDto);
        return reservationRepository.save(reservation);
    }

    public List<FlightSchedule> findUserFlights(int userId) {
        List<Reservation> reservations = reservationRepository.findByUserId(userId);
        return reservations.stream().map(Reservation::getFlightSchedule).collect(Collectors.toList());
    }

    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    public List<Reservation> getReservationsByFlightSchedule(FlightSchedule flightSchedule) {
        return reservationRepository.findByFlightSchedule(flightSchedule);
    }
}
