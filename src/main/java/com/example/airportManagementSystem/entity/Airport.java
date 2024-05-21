package com.example.airportManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String arrival;
    private String departure;

    private int aircraftCapacity;

    @ManyToOne
    @JoinColumn(name = "flight_schedule_id")
    private FlightSchedule flightSchedule;
}
