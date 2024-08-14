package org.example.adapter.controller;

import org.example.dto.EventDTO;
import org.example.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @PostMapping
    public ResponseEntity<EventDTO> createEvent(@RequestParam String name, @RequestParam LocalDate date, @RequestParam String location, @RequestParam int availableTickets) {
        return ResponseEntity.ok(eventService.createEvent(name, date, location, availableTickets));
    }

    @GetMapping
    public ResponseEntity<List<EventDTO>> listEvents() {
        return ResponseEntity.ok(eventService.listEvents());
    }
}
