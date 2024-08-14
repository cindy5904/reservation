package org.example.service.impl;

import org.example.dto.EventDTO;
import org.example.port.EventPort;
import org.example.service.EventService;

import java.time.LocalDate;
import java.util.List;

public class EventServiceImpl implements EventService {

    private final EventPort eventPort;

    public EventServiceImpl(EventPort eventPort) {
        this.eventPort = eventPort;
    }
    @Override
    public EventDTO createEvent(String name, LocalDate date, String location, int availableTickets) {
        EventDTO event = new EventDTO(name, date, location, availableTickets);
        return eventPort.save(event);
    }

    @Override
    public List<EventDTO> listEvents() {
        return eventPort.getAll();
    }
}
