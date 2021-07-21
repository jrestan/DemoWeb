package com.mitocode.repositories;

import com.mitocode.models.Usuarioweb;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuariowebRepo extends JpaRepository<Usuarioweb, Integer>{
    Usuarioweb findByNombre(String nombre);
}
