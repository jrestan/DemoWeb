package com.mitocode.rest;

import java.util.List;

import com.mitocode.models.Persona;
import com.mitocode.repositories.IPersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class RestContoller {

    @Autowired
    IPersonaRepo repo;

    @GetMapping
    public List<Persona>listar(){
        return repo.findAll();
    }

    @PostMapping
    public Persona insertar(@RequestBody Persona persona){
        return repo.save(persona);
    }
    
}
