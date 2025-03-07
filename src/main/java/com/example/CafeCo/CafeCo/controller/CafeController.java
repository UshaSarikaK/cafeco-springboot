package com.example.CafeCo.CafeCo.controller;



import com.example.CafeCo.CafeCo.model.Cafe;
import com.example.CafeCo.CafeCo.service.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cafes")
@CrossOrigin("*")
public class CafeController {

    @Autowired
    private CafeService cafeService;

    @GetMapping
    public ResponseEntity<List<Cafe>> getAllCafes() {
        return ResponseEntity.ok(cafeService.getAllCafes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cafe> getCafeById(@PathVariable Long id) {
        Optional<Cafe> cafe = cafeService.getCafeById(id);
        return cafe.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cafe> createCafe(@RequestBody Cafe cafe) {
        return ResponseEntity.ok(cafeService.saveCafe(cafe));
    }
}
