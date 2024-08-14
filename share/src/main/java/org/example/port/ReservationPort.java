package org.example.port;

import org.example.dto.ReservationDTO;

import java.util.List;

public interface ReservationPort {

    ReservationDTO save(ReservationDTO reservation);
    void delete(int id);
    List<ReservationDTO> getAll();
}
