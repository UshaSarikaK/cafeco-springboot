package com.example.CafeCo.CafeCo.service;



import com.example.CafeCo.CafeCo.model.Cafe;
import com.example.CafeCo.CafeCo.repo.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CafeService {

    @Autowired
    private CafeRepository cafeRepository;

    public List<Cafe> getAllCafes() {
        return cafeRepository.findAll();
    }

    public Optional<Cafe> getCafeById(Long id) {
        return cafeRepository.findById(id);
    }

    public Cafe saveCafe(Cafe cafe) {
        return cafeRepository.save(cafe);
    }
}

