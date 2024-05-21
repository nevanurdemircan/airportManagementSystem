package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.dto.PlaneDto;
import com.example.airportManagementSystem.entity.Plane;
import com.example.airportManagementSystem.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/plane")
public class PlaneController {
    private final PlaneService planeService;
    @PostMapping("/save")
    public ResponseEntity<Plane> savePlane(@RequestBody PlaneDto planeDto){
        Plane plane = planeService.savePlane(planeDto);
        return ResponseEntity.ok(plane);
    }
}
