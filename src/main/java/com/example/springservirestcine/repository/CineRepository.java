package com.example.springservirestcine.repository;

import com.example.springservirestcine.entities.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends JpaRepository<Cine,String> {
}
