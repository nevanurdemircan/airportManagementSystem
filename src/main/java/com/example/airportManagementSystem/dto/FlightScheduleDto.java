package com.example.airportManagementSystem.dto;

import com.example.airportManagementSystem.entity.Airport;
import com.example.airportManagementSystem.entity.Pilot;
import com.example.airportManagementSystem.entity.Plane;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class FlightScheduleDto {
    private int time;
    private int delayTime;
    private List<Plane> planes;
    private List<Pilot> pilots;
    private List<Airport> airports;
}
