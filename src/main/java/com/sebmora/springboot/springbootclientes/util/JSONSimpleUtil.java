package com.sebmora.springboot.springbootclientes.util;

import com.sebmora.springboot.springbootclientes.converter.ClienteConverter;
import com.sebmora.springboot.springbootclientes.domain.Cliente;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Sebastian.Mora on 23/08/2017.
 */
@Component
public class JsonSimpleUtil {

    public static final String LISTA_USUARIOS_KEY = "listaUsuarios";

    public ArrayList<Cliente> getClientes(Resource clientesResource) throws IOException, ParseException {
        InputStreamReader inputStreamReader = new InputStreamReader(clientesResource.getInputStream());

        JSONObject jsonObject = (JSONObject) (new JSONParser()).parse(inputStreamReader);
        JSONArray listaUsuarios = (JSONArray) jsonObject.get(LISTA_USUARIOS_KEY);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ClienteConverter clienteConverter = new ClienteConverter();

        for (Object o : listaUsuarios) {
            clientes.add(clienteConverter.convert((JSONObject) o));
        }
        return clientes;
    }
}
