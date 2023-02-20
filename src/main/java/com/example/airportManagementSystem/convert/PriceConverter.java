package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.PriceDto;
import com.example.airportManagementSystem.entity.Price;
import org.springframework.stereotype.Component;

@Component
public class PriceConverter {
    public PriceDto priceConvertToPriceDto(Price price) {
        PriceDto priceDto = new PriceDto();
        priceDto.setBusinessSeatPrice(price.getBusinessSeatPrice());
        priceDto.setEconomySeatPrice(price.getEconomySeatPrice());
        return priceDto;
    }
    public Price priceDtoConvertToPrice(PriceDto priceDto){
        Price price = new Price();
        price.setEconomySeatPrice(priceDto.getEconomySeatPrice());
        price.setBusinessSeatPrice(priceDto.getBusinessSeatPrice());
        return price;
    }
}
