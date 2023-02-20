package com.example.airportManagementSystem.dto;

import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.entity.Pilot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaneDto {
    private String name;
    private Pilot pilot;
    private FlightSchedule flightSchedule;
}
