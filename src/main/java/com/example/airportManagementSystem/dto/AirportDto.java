package com.example.airportManagementSystem.dto;

import com.example.airportManagementSystem.entity.FlightSchedule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirportDto {
    private String name;
    private String landingPlace;
    private String takeOff;
    private int aircraftCapacity;
    private FlightSchedule flightSchedule;

}
