package com.sebmora.springboot.springbootclientes.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */
@Getter
@Setter
public class Cliente {
    public String id;
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public int idDireccion;
    public String telefono;
    public String email;
}
