package org.example.infrastructure.portImpl;

import org.example.dto.EventDTO;
import org.example.infrastructure.repository.EventRepository;
import org.example.port.EventPort;

import java.util.List;

public class EventPortImpl implements EventPort {

    private final EventRepository eventRepository;

    public EventPortImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    @Override
    public EventDTO save(EventDTO event) {
        return null;
    }

    @Override
    public List<EventDTO> getAll() {
        return List.of();
    }
}
