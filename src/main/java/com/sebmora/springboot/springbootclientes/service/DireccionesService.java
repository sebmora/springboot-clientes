package com.sebmora.springboot.springbootclientes.service;

import com.sebmora.springboot.springbootclientes.domain.Direccion;
import com.sebmora.springboot.springbootclientes.util.JSONSimpleUtil;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sebastian.Mora on 25/08/2017.
 */
@Service
public class DireccionesService {

    @Value("classpath:json/direcciones.json")
    private Resource direccionesResource;

    @Autowired
    JSONSimpleUtil jsonSimpleUtil;


    public ArrayList<Direccion> getListaDirecciones() throws IOException, ParseException {
        return jsonSimpleUtil.mapperJSONArray(direccionesResource,JSONSimpleUtil.LISTA_DIRECCIONES_KEY,Direccion.class);
    }

    public ArrayList<Direccion> getListaDirecciones(int idDireccion) throws IOException, ParseException {
        return filtraDireccionesPorId(idDireccion, getListaDirecciones());
    }

    private ArrayList<Direccion> filtraDireccionesPorId(int idDireccion, ArrayList<Direccion> direcciones) {
        ArrayList<Direccion> direccionesFiltradas = new ArrayList<>();

        for (Direccion d : direcciones) {
            if (d.getIdDireccion() == idDireccion) {
                direccionesFiltradas.add(d);
            }
        }

        return direccionesFiltradas;
    }


}
