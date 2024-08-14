package org.example.service.impl;

import org.example.dto.ReservationDTO;
import org.example.port.ReservationPort;
import org.example.service.ReservationService;

import java.util.List;

public class ReservationServiceImpl implements ReservationService {

    private final ReservationPort reservationPort;

    public ReservationServiceImpl(ReservationPort reservationPort) {
        this.reservationPort = reservationPort;
    }
    @Override
    public ReservationDTO reserveTicket(int eventId, String user, int numberOfTickets) {
        ReservationDTO reservation = new ReservationDTO(eventId, user, numberOfTickets);
        return reservationPort.save(reservation);
    }

    @Override
    public void cancelReservation(int id) {
        reservationPort.delete(id);
    }

    @Override
    public List<ReservationDTO> listReservations() {
        return reservationPort.getAll();
    }
}
