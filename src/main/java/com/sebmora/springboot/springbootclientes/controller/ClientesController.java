package com.sebmora.springboot.springbootclientes.controller;

import com.sebmora.springboot.springbootclientes.domain.Cliente;
import com.sebmora.springboot.springbootclientes.service.ClientesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */

@RestController
@RequestMapping(value = "/clientes")
@Api(value = "Clientes", description = "Controller datos de los clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @ApiOperation(value = "Listado de los clientes del sistema")
    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Cliente> listaClientes() throws IOException, ParseException {
        return clientesService.getListadoClientes();
    }

    @ApiOperation(value = "Listado de los clientes del sisema filtrados por idCliente")
    @RequestMapping(value = "/{idCliente}", method = RequestMethod.GET)
    public ArrayList<Cliente> clientePorId(@PathVariable(value = "idCliente") String idCliente) throws IOException, ParseException {
        return clientesService.getListadoClientesPorId(idCliente);
    }

}