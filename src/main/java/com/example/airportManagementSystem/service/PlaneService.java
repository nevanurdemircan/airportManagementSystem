package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.PlaneDto;
import com.example.airportManagementSystem.entity.Plane;
import com.example.airportManagementSystem.repository.PlaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlaneService {
    private final PlaneRepository planeRepository;

    public Plane savePlane(PlaneDto planeDto){
        Plane plane = new Plane();
        plane.setName(planeDto.getName());
        plane.setPilot(planeDto.getPilot());
        plane.setFlightSchedule(planeDto.getFlightSchedule());
        return planeRepository.save(plane);
    }
}
