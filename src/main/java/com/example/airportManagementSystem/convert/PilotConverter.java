package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.PilotDto;
import com.example.airportManagementSystem.entity.Pilot;
import org.springframework.stereotype.Component;

@Component
public class PilotConverter {
    public PilotDto pilotConvertToPilotDto(Pilot pilot){
        PilotDto pilotDto = new PilotDto();
        pilotDto.setName(pilot.getName());
        pilotDto.setAge(pilot.getAge());
        pilotDto.setPlanes(pilot.getPlanes());
        pilotDto.setGender(pilot.getGender());
        pilotDto.setFlightSchedule(pilot.getFlightSchedule());
        return pilotDto;
    }
    public Pilot pilotDtoConvertToPilot(PilotDto pilotDto){
        Pilot pilot = new Pilot();
        pilot.setAge(pilotDto.getAge());
        pilot.setPlanes(pilotDto.getPlanes());
        pilot.setGender(pilotDto.getGender());
        pilot.setName(pilotDto.getName());
        pilot.setFlightSchedule(pilot.getFlightSchedule());
        return pilot;
    }
}
