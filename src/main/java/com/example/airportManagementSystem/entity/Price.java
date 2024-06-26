package com.example.airportManagementSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;import lombok.Getter;
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

    @ManyToOne
    @JoinColumn(name = "flight_schedule_id")
    @JsonIgnore
    private FlightSchedule flightSchedule;
}
