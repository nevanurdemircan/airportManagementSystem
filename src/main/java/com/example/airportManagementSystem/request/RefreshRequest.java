package com.example.airportManagementSystem.request;

import lombok.Data;

@Data
public class RefreshRequest {
    Long userId;
    String refreshToken;
}
