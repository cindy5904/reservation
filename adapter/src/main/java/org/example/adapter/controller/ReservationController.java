package org.example.adapter.controller;

import org.example.dto.ReservationDTO;
import org.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity<ReservationDTO> reserveTicket(@RequestParam int eventId, @RequestParam String user, @RequestParam int numberOfTickets) {
        return ResponseEntity.ok(reservationService.reserveTicket(eventId, user, numberOfTickets));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelReservation(@PathVariable int id) {
        reservationService.cancelReservation(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ReservationDTO>> listReservations() {
        return ResponseEntity.ok(reservationService.listReservations());
    }
}
