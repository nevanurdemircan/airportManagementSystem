package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.PilotDto;
import com.example.airportManagementSystem.entity.Pilot;
import com.example.airportManagementSystem.repository.PilotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PilotService {
    private final PilotRepository pilotRepository;

    public Pilot savePilot(PilotDto pilotDto){
       Pilot pilot = new Pilot();
       pilot.setId(pilotDto.getId());
       pilot.setAge(pilotDto.getAge());
       pilot.setName(pilotDto.getName());
       pilot.setPlanes(pilotDto.getPlanes());
       pilot.setGender(pilotDto.getGender());
       pilot.setFlightSchedule(pilot.getFlightSchedule());
        return pilotRepository.save(pilot);
    }
}
