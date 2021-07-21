package com.mitocode.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarioweb {

    @Id
    private int id;
    private String nombre;
    private String clave;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    


}
