package org.example.service;

import org.example.dto.EventDTO;

import java.time.LocalDate;
import java.util.List;

public interface EventService {
   EventDTO createEvent(String name, LocalDate date, String location, int availableTickets);
    List<EventDTO> listEvents();
}
