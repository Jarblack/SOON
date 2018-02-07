package com.example.jarblack.uccv01;

import java.io.Serializable;

/**
 * Created by Jarblack on 18/11/2017.
 */

public class Datos implements Serializable {

    private int id;
    private String titulo,descripcion,direccion,transporte,caracteristicas,ubicacion;
    private int []imagenes;
    private double longi,lat;//Coordenadas del mapa

    public Datos(int id, String titulo,String descripcion, String direccion, String transporte, String caracteristicas, String ubicacion, int[] imagenes, double longi, double lat) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion=descripcion;
        this.direccion = direccion;
        this.transporte = transporte;
        this.caracteristicas = caracteristicas;
        this.ubicacion = ubicacion;
        this.imagenes = imagenes;
        this.longi = longi;
        this.lat = lat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(int[] imagenes) {
        this.imagenes = imagenes;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
