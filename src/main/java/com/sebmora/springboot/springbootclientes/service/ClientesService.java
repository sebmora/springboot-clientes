package com.sebmora.springboot.springbootclientes.service;

import com.sebmora.springboot.springbootclientes.domain.Cliente;
import com.sebmora.springboot.springbootclientes.util.JSONSimpleUtil;
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
    private JSONSimpleUtil jsonSimpleUtil;

    public ArrayList<Cliente> getListadoClientes() throws IOException, ParseException {
        return jsonSimpleUtil.mapperJSONArray(clientesResource, JSONSimpleUtil.LISTA_USUARIOS_KEY, Cliente.class);
    }

    public ArrayList<Cliente> getListadoClientesPorId(String idCliente) throws IOException, ParseException {
        return filtrarClientes(idCliente, getListadoClientes());
    }

    private ArrayList<Cliente> filtrarClientes(String idCliente, ArrayList<Cliente> listadoClientes) {

        String filtroIdCliente = idCliente.trim().replace('-', ';').split(";")[0];

        ArrayList<Cliente> listaFiltrada = new ArrayList<>();
        for (Cliente c : listadoClientes) {
            if (c.getId().contains(filtroIdCliente)) {
                listaFiltrada.add(c);
            }
        }
        return listaFiltrada;
    }
}
