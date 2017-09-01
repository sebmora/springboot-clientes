package com.sebmora.springboot.springbootclientes.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Sebastian.Mora on 25/08/2017.
 */
@Getter
@Setter
public class Direccion {

    @ApiModelProperty(notes = "id unico direccion cliente", required = true)
    private int idDireccion;

    @ApiModelProperty(notes = "descripcion estilo google maps del lugar exacto")
    private String locacion;

    @ApiModelProperty(notes = "place Id de google maps correspondiente a la locacion exacta")
    private String placeId;

    @ApiModelProperty(notes = "coordenadas de google maps correspondiente a la locacion exacta")
    private String coordenadas;
}
