package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot,Integer> {
}
