package com.sebmora.springboot.springbootclientes.service;

import com.sebmora.springboot.springbootclientes.domain.Cliente;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */
@Service
public class ClientesService {

    @Value("classpath:json/clientes.json")
    private Resource clientesResource;

    public ArrayList<Cliente> getListadoClientes() throws IOException, ParseException {
        InputStreamReader inputStreamReader = new InputStreamReader(clientesResource.getInputStream());

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(inputStreamReader);
        System.out.println(jsonObject);

        return null;
    }
}
