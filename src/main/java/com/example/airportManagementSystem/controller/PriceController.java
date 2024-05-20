package com.example.airportManagementSystem.controller;

import com.example.airportManagementSystem.dto.PriceDto;
import com.example.airportManagementSystem.entity.Price;
import com.example.airportManagementSystem.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/price")
public class PriceController {
    private final PriceService priceService;

    @PostMapping("/save")
    public Price savePrice(@RequestBody PriceDto priceDto){
        return priceService.savePrice(priceDto);
    }
}
