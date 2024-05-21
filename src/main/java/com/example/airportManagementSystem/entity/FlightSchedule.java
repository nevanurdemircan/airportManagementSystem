package com.example.airportManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class FlightSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate date;
    private int time;
    private int delayTime;
    private String departure;
    private String arrival;

    @OneToMany(mappedBy = "flightSchedule")
    private List<Plane> planes;

    @OneToMany(mappedBy = "flightSchedule")
    private List<Pilot> pilots;

    @OneToMany(mappedBy = "flightSchedule")
    private List<Airport> airports;

    @OneToMany(mappedBy = "flightSchedule")
    private List<Price> prices;


}
