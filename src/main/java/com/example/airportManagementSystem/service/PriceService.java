package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.PriceDto;
import com.example.airportManagementSystem.entity.FlightSchedule;
import com.example.airportManagementSystem.entity.Price;
import com.example.airportManagementSystem.repository.FlightScheduleRepository;
import com.example.airportManagementSystem.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PriceService {
    private final PriceRepository priceRepository;
    private final FlightScheduleRepository flightScheduleRepository;

    public Price savePrice(PriceDto priceDto){
        Price price = new Price();
        price.setBusinessSeatPrice(priceDto.getBusinessSeatPrice());
        price.setEconomySeatPrice(priceDto.getEconomySeatPrice());

        FlightSchedule flightSchedule = flightScheduleRepository.findById(priceDto.getFlightScheduleId()).orElseThrow(()-> new RuntimeException("FlightSchedule not found"));
        price.setFlightSchedule(flightSchedule);

        return priceRepository.save(price);
    }
}
