package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.AirportDto;
import com.example.airportManagementSystem.entity.Airport;
import org.springframework.stereotype.Component;

@Component
public class AirportConverter {
    public AirportDto airportConvertToAirportDto(Airport airport){
        AirportDto airportDto = new AirportDto();
        airportDto.setName(airport.getName());
        airportDto.setTakeOff(airport.getTakeOff());
        airportDto.setLandingPlace(airport.getLandingPlace());
        airportDto.setFlightSchedule(airport.getFlightSchedule());
        airportDto.setAircraftCapacity(airport.getAircraftCapacity());
        return airportDto;
    }
    public Airport airportDtoConvertToAirport(AirportDto airportDto){
        Airport airport = new Airport();
        airport.setName(airportDto.getName());
        airport.setTakeOff(airportDto.getTakeOff());
        airport.setLandingPlace(airportDto.getLandingPlace());
        airport.setFlightSchedule(airportDto.getFlightSchedule());
        airport.setAircraftCapacity(airportDto.getAircraftCapacity());
        return airport;
    }
}
