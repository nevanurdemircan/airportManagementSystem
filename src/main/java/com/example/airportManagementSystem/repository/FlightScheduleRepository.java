package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule,Integer> {
}
