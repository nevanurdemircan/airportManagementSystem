package com.example.airportManagementSystem.dto;

import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.entity.Plane;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class PilotDto {
    private String name;
    private String gender;
    private int age;
    private FlightSchedule flightSchedule;
    private List<Plane> planes;
}
