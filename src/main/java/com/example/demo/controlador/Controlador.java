package com.example.demo.controlador;


import com.example.demo.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controlador {

    @Autowired
    private Servicio servicio;

    @GetMapping("/suma")
    public Double suma(@RequestParam Double v1, @RequestParam Double v2){
        return servicio.sumaServicio(v1,v2);
    }

    @GetMapping("/resta")
    public double resta(@RequestParam double v1, @RequestParam double v2){
        return servicio.restaServicio(v1,v2);
    }

    @GetMapping("/multiplicacion")
    public Double multiplicacion(@RequestParam Double v1, @RequestParam Double v2){
        return servicio.multiplicacionServicio(v1,v2);
    }

    @GetMapping("/division")
    public Double division(@RequestParam Double v1, @RequestParam Double v2){
        return servicio.divisionServicio(v1,v2);
    }

}
