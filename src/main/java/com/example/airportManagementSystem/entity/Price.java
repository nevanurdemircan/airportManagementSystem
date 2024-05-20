package com.example.airportManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int businessSeatPrice;
    private int economySeatPrice;
}
