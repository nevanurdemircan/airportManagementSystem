package com.example.airportManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class FlightSchedule {
    @Id
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
