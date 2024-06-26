package com.example.airportManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "pilot_id")
    private Pilot pilot;
    @ManyToOne
    @JoinColumn(name = "flight_schedule_id")
    private FlightSchedule flightSchedule;
}
