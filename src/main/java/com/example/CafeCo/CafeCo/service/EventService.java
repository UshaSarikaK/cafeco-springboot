package com.example.CafeCo.CafeCo.service;



import com.example.CafeCo.CafeCo.model.Event;
import com.example.CafeCo.CafeCo.repo.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }
}
