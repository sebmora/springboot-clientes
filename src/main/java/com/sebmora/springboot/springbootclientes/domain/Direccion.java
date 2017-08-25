package com.sebmora.springboot.springbootclientes.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Sebastian.Mora on 25/08/2017.
 */
@Getter
@Setter
public class Direccion {
    private int idDireccion;
    private String locacion;
    private String placeId;
    private String coordenadas;
}
