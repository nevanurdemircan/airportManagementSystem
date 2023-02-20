package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.PlaneDto;
import com.example.airportManagementSystem.entity.Plane;
import org.springframework.stereotype.Component;

@Component
public class PlaneConverter {
    public PlaneDto planeDtoConvertToPlane(Plane plane){
        PlaneDto planeDto = new PlaneDto();
        planeDto.setName(plane.getName());
        planeDto.setPilot(plane.getPilot());
        planeDto.setFlightSchedule(plane.getFlightSchedule());
        return planeDto;
    }
    public Plane planeConvertToPlaneDto(PlaneDto planeDto){
        Plane plane = new Plane();
        plane.setFlightSchedule(planeDto.getFlightSchedule());
        plane.setPilot(planeDto.getPilot());
        plane.setName(planeDto.getName());
        return plane;
    }
}
