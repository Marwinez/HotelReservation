package com.example.hotelsapplication.remote.rest.dto.response;

import com.example.hotelsapplication.remote.rest.dto.request.PersonReservationDto;

public class ReservationsCollectionDto {
    private ReservationDto reservations;
    private PersonReservationDto person;

    public ReservationsCollectionDto() {
    }

    public ReservationsCollectionDto(ReservationDto reservations, PersonReservationDto person) {
        this.reservations = reservations;
        this.person = person;
    }

    public ReservationDto getReservations() {
        return reservations;
    }

    public void setReservations(ReservationDto reservations) {
        this.reservations = reservations;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
