package com.example.CafeCo.CafeCo.repo;


import com.example.CafeCo.CafeCo.model.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Long> {
}
