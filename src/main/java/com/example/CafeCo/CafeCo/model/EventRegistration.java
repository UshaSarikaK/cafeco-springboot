package com.example.CafeCo.CafeCo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "event_registrations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamName;
    private String contactPerson;
    private String email;
    private String phone;
    private String eventType; // Singing or Comedy
    private String pastPerformanceVideo;

    @Lob
    private byte[] teamImage;

    public void setTeamName(String teamName) {
    }

    public void setContactPerson(String contactPerson) {
    }

    public void setEmail(String email) {
    }

    public Long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEventType() {
        return eventType;
    }

    public String getPastPerformanceVideo() {
        return pastPerformanceVideo;
    }

    public byte[] getTeamImage() {
        return teamImage;
    }

    public void setPhone(String phone) {
    }

    public void setEventType(String eventType) {
    }

    public void setPastPerformanceVideo(String pastPerformanceVideo) {
    }

    public void setTeamImage(byte[] bytes) {
    }
}
