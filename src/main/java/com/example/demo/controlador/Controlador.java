package com.example.demo.controlador;


import com.example.demo.dto.DtoResponse;
import com.example.demo.modelo.Persona;
import com.example.demo.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class Controlador {

    @Autowired
    private Servicio servicio;

    @PostMapping("/crearPersona")
    public Persona crearPersona(@RequestBody Persona p){

        return servicio.crearPersonaServicio(p);

    }

}
