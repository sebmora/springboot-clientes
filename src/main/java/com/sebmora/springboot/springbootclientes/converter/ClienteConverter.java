package com.sebmora.springboot.springbootclientes.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sebmora.springboot.springbootclientes.domain.Cliente;
import org.json.simple.JSONObject;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;

/**
 * Created by Sebastian.Mora on 23/08/2017.
 */
public class ClienteConverter implements Converter<JSONObject, Cliente> {

    @Override
    public Cliente convert(JSONObject jsonObject) {
        Cliente cliente;
        ObjectMapper mapper = new ObjectMapper();
        try {
            cliente = mapper.readValue(jsonObject.toJSONString(), Cliente.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return cliente;
    }
}
