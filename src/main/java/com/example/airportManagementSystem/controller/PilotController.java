package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.dto.PilotDto;
import com.example.airportManagementSystem.entity.Pilot;
import com.example.airportManagementSystem.service.PilotService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pilot")
public class PilotController {
    private final PilotService pilotService;

    @PostMapping("/save")
    public ResponseEntity<Pilot> savePilot(@RequestBody PilotDto pilotDto){
        Pilot pilot = pilotService.savePilot(pilotDto);
        return ResponseEntity.ok(pilot);
    }
}
