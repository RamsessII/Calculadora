package com.example.demo.servicio;

import com.example.demo.dto.DtoResponse;
import com.example.demo.modelo.Persona;
import com.example.demo.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired
    private UsuarioRepository repositorio;

    public Persona crearPersonaServicio(Persona p){
        return  repositorio.save(p);
    }



}
