package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.FlightScheduleDto;
import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.entity.Reservation;
import com.example.airportManagementSystem.repository.FlightScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class FlightScheduleService {
    private final FlightScheduleRepository flightScheduleRepository;
    private final ReservationService reservationService;

    public FlightSchedule saveFlightSchedule(FlightScheduleDto flightScheduleDto) {
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setPlanes(flightScheduleDto.getPlanes());
        flightSchedule.setTime(flightScheduleDto.getTime());
        flightSchedule.setAirports(flightScheduleDto.getAirports());
        flightSchedule.setDelayTime(flightScheduleDto.getDelayTime());
        return flightScheduleRepository.save(flightSchedule);
    }

    public List<FlightSchedule> findAll() {
        return flightScheduleRepository.findAll();
    }

    public FlightSchedule getFlightById(int id) {
        return flightScheduleRepository.getFlightScheduleById(id);
    }

    public List<FlightSchedule> searchFlights(LocalDate date, String arrival, String departure) {
        return flightScheduleRepository.findByDepartureAndArrivalAndDate(departure, arrival, date);
    }

    public List<FlightSchedule> getAllFlightsSortedByPriceAsc() {
        return flightScheduleRepository.findAll(Sort.by(Sort.Direction.ASC, "prices"));
    }

    public List<FlightSchedule> getAllFlightsSortedByPriceDesc() {
        return flightScheduleRepository.findAll(Sort.by(Sort.Direction.DESC, "prices"));
    }

    public List<Integer> findAvailableSeats(FlightSchedule flightSchedule){
        int totalSeats = 100;

        List<Reservation> reservations = reservationService.getReservationsByFlightSchedule(flightSchedule);

        Set<Integer> reservedSeats = new HashSet<>();
        for (Reservation reservation : reservations){
            reservedSeats.add(reservation.getSeatNumber());
        }

        List<Integer> allSeats = new ArrayList<>();
        for(int i = 1; i <= totalSeats; i++){
            allSeats.add(i);
        }
        allSeats.removeAll(reservedSeats);

        return allSeats;
    }
}
