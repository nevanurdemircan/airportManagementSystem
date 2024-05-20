package com.example.airportManagementSystem.service;

import com.example.airportManagementSystem.dto.PriceDto;
import com.example.airportManagementSystem.entity.Price;
import com.example.airportManagementSystem.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PriceService {
    private final PriceRepository priceRepository;

    public Price savePrice(PriceDto priceDto){
        Price price = new Price();
        price.setBusinessSeatPrice(priceDto.getBusinessSeatPrice());
        price.setEconomySeatPrice(priceDto.getEconomySeatPrice());
        return priceRepository.save(price);
    }
}
