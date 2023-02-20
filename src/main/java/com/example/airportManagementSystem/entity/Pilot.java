package com.example.airportManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Pilot {
    @Id
    private int id;
    private String name;
    private String gender;
    private int age;

    @OneToMany(mappedBy = "pilot")
    private List<Plane>planes;

    @ManyToOne
    @JoinColumn(name = "flight_schedule_id")
    private FlightSchedule flightSchedule;

}
