package com.example.airportManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class FlightSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int time;
    private int delayTime;

    @OneToMany(mappedBy = "flightSchedule")
    private List<Plane> planes;

    @OneToMany(mappedBy = "flightSchedule")
    private List<Pilot> pilots;

    @OneToMany(mappedBy = "flightSchedule")
    private List<Airport> airports;
}
