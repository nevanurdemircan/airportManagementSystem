package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport,Integer> {
}
