package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.FlightScheduleDto;
import com.example.airportManagementSystem.entity.FlightSchedule;
import org.springframework.stereotype.Component;

@Component
public class FlightScheduleConverter {
    public FlightScheduleDto flightScheduleConvertToFlightScheduleDto(FlightSchedule flightSchedule){
        FlightScheduleDto flightScheduleDto = new FlightScheduleDto();
        flightScheduleDto.setAirports(flightSchedule.getAirports());
        flightScheduleDto.setTime(flightSchedule.getTime());
        flightScheduleDto.setPlanes(flightSchedule.getPlanes());
        flightScheduleDto.setDelayTime(flightSchedule.getDelayTime());
        flightScheduleDto.setPilots(flightSchedule.getPilots());
        return flightScheduleDto;
    }
    public FlightSchedule flightScheduleDtoConvertToFlightSchedule(FlightScheduleDto flightScheduleDto){
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setAirports(flightScheduleDto.getAirports());
        flightScheduleDto.setPilots(flightScheduleDto.getPilots());
        flightScheduleDto.setTime(flightScheduleDto.getTime());
        flightScheduleDto.setPlanes(flightSchedule.getPlanes());
        flightScheduleDto.setDelayTime(flightSchedule.getDelayTime());
        return flightSchedule;
    }
}
