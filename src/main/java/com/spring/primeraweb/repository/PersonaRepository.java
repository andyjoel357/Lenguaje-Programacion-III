package com.spring.primeraweb.repository;

import com.spring.primeraweb.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository < Persona, Long > {

        }
