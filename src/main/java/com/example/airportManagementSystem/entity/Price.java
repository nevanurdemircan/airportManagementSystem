package com.example.airportManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Price {
    @Id
    private int id;
    private int businessSeatPrice;
    private int economySeatPrice;
}
