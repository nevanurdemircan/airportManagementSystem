package com.example.airportManagementSystem.dto;

import com.example.airportManagementSystem.entity.Airport;
import com.example.airportManagementSystem.entity.Pilot;
import com.example.airportManagementSystem.entity.Plane;
import com.example.airportManagementSystem.entity.Reservation;
import com.example.airportManagementSystem.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
public class FlightScheduleDto {

    private LocalDate date;
    private int time;
    private int delayTime;
    private String departure;
    private String arrival;
    private List<Plane> planes;
    private List<Pilot> pilots;
    private List<Airport> airports;
    private List<Reservation> reservations;
    private List<User> users;

}
