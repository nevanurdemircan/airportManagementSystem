package com.example.airportManagementSystem.repository;

import com.example.airportManagementSystem.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PriceRepository extends JpaRepository<Price,Integer> {
}
