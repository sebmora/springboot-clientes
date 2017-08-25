package com.sebmora.springboot.springbootclientes.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sebmora.springboot.springbootclientes.domain.Direccion;
import org.json.simple.JSONObject;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;

/**
 * Created by Sebastian.Mora on 25/08/2017.
 */
public class DireccionConverter implements Converter<JSONObject, Direccion> {
    @Override
    public Direccion convert(JSONObject jsonObject) {
        Direccion direccion;
        ObjectMapper mapper = new ObjectMapper();
        try {
            direccion = mapper.readValue(jsonObject.toJSONString(), Direccion.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return direccion;
    }
}
