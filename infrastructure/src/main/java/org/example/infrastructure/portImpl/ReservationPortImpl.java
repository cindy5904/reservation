package org.example.infrastructure.portImpl;

import org.example.dto.ReservationDTO;
import org.example.infrastructure.repository.ReservationRepository;
import org.example.port.ReservationPort;

import java.util.List;

public class ReservationPortImpl implements ReservationPort {
    private final ReservationRepository reservationRepository;

    public ReservationPortImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    @Override
    public ReservationDTO save(ReservationDTO reservation) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<ReservationDTO> getAll() {
        return List.of();
    }
}
