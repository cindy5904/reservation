package org.example.port;

import org.example.dto.EventDTO;

import java.util.List;

public interface EventPort {

    EventDTO save(EventDTO event);
    List<EventDTO> getAll();

}
