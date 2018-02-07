package com.example.jarblack.uccv01;

import java.io.Serializable;

/**
 * Created by Jarblack on 23/11/2017.
 */

public class Carreras implements Serializable {

    private int id,creditos,semestres,snies;
    private double valor_credito;
    private String carrera,ciudad;

    public Carreras(int id, String carrera, int creditos, double valor_credito, int semestres, String ciudad,int snies) {
        this.id = id;
        this.creditos = creditos;
        this.snies = snies;
        this.valor_credito = valor_credito;
        this.carrera = carrera;
        this.ciudad = ciudad;
        this.semestres=semestres;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSnies() {
        return snies;
    }

    public void setSnies(int snies) {
        this.snies = snies;
    }

    public double getValor_credito() {
        return valor_credito;
    }

    public void setValor_credito(double valor_credito) {
        this.valor_credito = valor_credito;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
