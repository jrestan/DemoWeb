package com.mitocode.repositories;

import com.mitocode.models.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
        
}
