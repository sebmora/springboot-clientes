package com.sebmora.springboot.springbootclientes.domain;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Sebastian.Mora on 22/08/2017.
 */

public class Cliente {

    @ApiModelProperty(notes = "id Cliente, regularmente el RUN o DNI")
    private String id;
    @ApiModelProperty(notes = "nombre del cliente")
    private String nombre;
    @ApiModelProperty(notes = "apellido paterno del cliente")
    private String apellidoPaterno;
    @ApiModelProperty(notes = "apellido materno del cliente")
    private String apellidoMaterno;
    @ApiModelProperty(notes = "id direccion del cliente")
    private int idDireccion;
    @ApiModelProperty(notes = "telefono contacto del cliente")
    private String telefono;
    @ApiModelProperty(notes = "email contacto del cliente")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
