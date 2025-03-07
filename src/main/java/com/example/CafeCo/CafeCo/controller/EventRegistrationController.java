package com.example.CafeCo.CafeCo.controller;

import com.example.CafeCo.CafeCo.model.EventRegistration;
import com.example.CafeCo.CafeCo.service.EventRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin("*")
public class EventRegistrationController {

    @Autowired
    private EventRegistrationService service;

    @PostMapping("/register")
    public ResponseEntity<EventRegistration> registerEvent(
            @RequestParam("teamName") String teamName,
            @RequestParam("contactPerson") String contactPerson,
            @RequestParam("email") String email,
            @RequestParam("phone") String phone,
            @RequestParam("eventType") String eventType,
            @RequestParam("pastPerformanceVideo") String pastPerformanceVideo,
            @RequestParam("teamImage") MultipartFile teamImage
    ) throws IOException {
        EventRegistration registration = new EventRegistration();
        registration.setTeamName(teamName);
        registration.setContactPerson(contactPerson);
        registration.setEmail(email);
        registration.setPhone(phone);
        registration.setEventType(eventType);
        registration.setPastPerformanceVideo(pastPerformanceVideo);
        registration.setTeamImage(teamImage.getBytes());

        return ResponseEntity.ok(service.registerEvent(registration));
    }

    @GetMapping("/registrations")
    public ResponseEntity<List<EventRegistration>> getAllRegistrations() {
        return ResponseEntity.ok(service.getAllRegistrations());
    }
}
