package com.example.airportManagementSystem.convert;

import com.example.airportManagementSystem.dto.ReservationDto;
import com.example.airportManagementSystem.entity.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationConverter {

    public ReservationDto convertToReservationDto(Reservation reservation) {
        ReservationDto reservationDto = new ReservationDto();
        reservationDto.setSeatNumber(reservation.getSeatNumber());

        return reservationDto;
    }

    public Reservation convertToReservation(ReservationDto reservationDto) {
        Reservation reservation = new Reservation();
        reservation.setSeatNumber(reservationDto.getSeatNumber());
        return reservation;
    }
}
