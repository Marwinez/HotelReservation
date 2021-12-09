package com.example.hotelsapplication.remote.rest.dto.response;

import com.example.hotelsapplication.domain.StatusReservationDto;
import com.example.hotelsapplication.remote.rest.dto.request.HotelReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private StatusReservationDto status;
    private List<HotelReservationDto> rooms;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, StatusReservationDto status, List<HotelReservationDto> rooms) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusReservationDto getStatus() {
        return status;
    }

    public void setStatus(StatusReservationDto status) {
        this.status = status;
    }

    public List<HotelReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<HotelReservationDto> rooms) {
        this.rooms = rooms;
    }
}
