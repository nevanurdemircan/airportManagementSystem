package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.FlightSchedule;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule,Integer> {
    FlightSchedule getFlightScheduleById(int id);
    List<FlightSchedule> findByDepartureAndArrivalAndDate(@Param("departure") String departure, @Param("arrival") String arrival, @Param("date") LocalDate date);

    List<FlightSchedule> findAll(Sort sort);
}
