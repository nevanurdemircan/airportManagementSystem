package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Integer> {
}
