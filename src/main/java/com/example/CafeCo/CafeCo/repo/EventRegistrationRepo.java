package com.example.CafeCo.CafeCo.repo;

import com.example.CafeCo.CafeCo.model.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRegistrationRepo extends JpaRepository<EventRegistration, Long> {
}