package com.example.demo.servicio;

import org.springframework.stereotype.Service;

@Service
public class Servicio {
    public double sumaServicio(double v1, double v2){
        return v1+v2;
    }

    public double restaServicio(double v1, double v2){
        return v1-v2;
    }

    public double multiplicacionServicio(double v1, double v2){
        return v1*v2;
    }

    public double divisionServicio(double v1, double v2){
        return v1/v2;
    }
}
