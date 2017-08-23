package com.sebmora.springboot.springbootclientes.controller;

import com.sebmora.springboot.springbootclientes.domain.Cliente;
import com.sebmora.springboot.springbootclientes.service.ClientesService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */
@RestController
@RequestMapping(value = "/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @RequestMapping(value = "/saludo/{nombre}")
    public String saludo(@PathVariable(value = "nombre") String nombre) {
        return "hola " + nombre + " !.";
    }

    @RequestMapping(value = "/listado")
    public ArrayList<Cliente> listaUsuarios() throws IOException, ParseException {
        return clientesService.getListadoClientes();
    }
}
