package com.sebmora.springboot.springbootclientes.service;

import com.sebmora.springboot.springbootclientes.domain.Cliente;
import com.sebmora.springboot.springbootclientes.util.JsonSimpleUtil;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */
@Service
public class ClientesService {

    @Value("classpath:json/clientes.json")
    private Resource clientesResource;

    @Autowired
    private JsonSimpleUtil jsonSimpleUtil;

    public ArrayList<Cliente> getListadoClientes() throws IOException, ParseException {
        ArrayList<Cliente> clientes = jsonSimpleUtil.getClientes(clientesResource);
        return clientes;
    }
}
