package com.example.CafeCo.CafeCo.service;

import com.example.CafeCo.CafeCo.model.EventRegistration;
import com.example.CafeCo.CafeCo.repo.EventRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventRegistrationService {

    @Autowired
    private EventRegistrationRepo repository;

    public EventRegistration registerEvent(EventRegistration registration) {
        return repository.save(registration);
    }

    public List<EventRegistration> getAllRegistrations() {
        return repository.findAll();
    }
}
