package com.sebmora.springboot.springbootclientes.util;

import org.json.simple.JSONObject;

import java.util.ArrayList;

public interface GenericMapper<T> {
    public ArrayList<T> mapToDomain(JSONObject object, Class<T> clase);
}
