package com.sebmora.springboot.springbootclientes.service;

import com.sebmora.springboot.springbootclientes.domain.Cliente;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class ClientesServiceTest {


//    @Value("classpath:json/clientes.json")
//    Resource clientesResource;
//
//    @InjectMocks
//    ClientesService clientesService;

    @Autowired
    ClientesService clientesService;

    @Test
    public void test() throws IOException, ParseException {

        ArrayList<Cliente> listadoClientes = clientesService.getListadoClientes();
        assertNotNull(listadoClientes);
    }
}
