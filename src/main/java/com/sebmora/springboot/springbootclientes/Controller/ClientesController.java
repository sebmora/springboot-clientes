package com.sebmora.springboot.springbootclientes.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */
@RestController
@RequestMapping(value = "/clientes")
public class ClientesController {

    @RequestMapping(value = "/saludo/{nombre}")
    public String saludo(@PathVariable(value = "nombre") String nombre) {
        return "hola " + nombre + " !.";
    }

}
