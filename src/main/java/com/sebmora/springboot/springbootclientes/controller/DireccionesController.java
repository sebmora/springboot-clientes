package com.sebmora.springboot.springbootclientes.controller;

import com.sebmora.springboot.springbootclientes.domain.Direccion;
import com.sebmora.springboot.springbootclientes.service.DireccionesService;
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
 * Created by Sebastian.Mora on 25/08/2017.
 */
@RestController
@RequestMapping(value = "/direcciones")
@Api(value = "Direcciones", description = "Controller con direcciones de clientes")
public class DireccionesController {

    @Autowired
    DireccionesService direccionesService;

    @ApiOperation(value = "Listado direcciones clientes del sistema", response = ArrayList.class)
    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Direccion> listaDirecciones() throws IOException, ParseException {
        return direccionesService.getListaDirecciones();
    }

    @ApiOperation(value = "Listado direcciones clientes del sistema por id direccion", response = ArrayList.class)
    @RequestMapping(value = "/{idDireccion}", method = RequestMethod.GET)
    public ArrayList<Direccion> listaDireccionesById(@PathVariable(value = "idDireccion") int idDireccion) throws IOException, ParseException {
        return direccionesService.getListaDirecciones(idDireccion);
    }
}