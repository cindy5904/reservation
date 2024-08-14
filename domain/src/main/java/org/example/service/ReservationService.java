package org.example.service;

import org.example.dto.ReservationDTO;

import java.util.List;

public interface ReservationService {
    ReservationDTO reserveTicket(int eventId, String user, int numberOfTickets);
    void cancelReservation(int id);
    List<ReservationDTO> listReservations();
}
