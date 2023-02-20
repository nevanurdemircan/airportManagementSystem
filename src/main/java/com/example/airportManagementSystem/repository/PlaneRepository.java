package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Integer> {
}
