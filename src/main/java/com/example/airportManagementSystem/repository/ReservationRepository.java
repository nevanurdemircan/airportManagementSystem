package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findByUserId(int userId);

    List<Reservation> findByFlightSchedule(FlightSchedule flightSchedule);
}
