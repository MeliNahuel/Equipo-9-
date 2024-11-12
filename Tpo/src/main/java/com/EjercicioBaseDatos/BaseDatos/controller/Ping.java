package com.EjercicioBaseDatos.BaseDatos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {

    @GetMapping("/ping")
    public String pingPong(){
        return "pong";
    }
}
