/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_joshuamartinez;

import java.awt.Color;

/**
 *
 * @author joshu
 */
public class Registro_casas {

    private int casa, bloque, ancho, largo, pisos, baños, cuartos;
    private String Nombre, estado, ingeniero, comprada, color;

    public Registro_casas() {
    }

    public Registro_casas(int casa, int bloque, String color, int ancho, int largo, String comprada, int pisos, int baños, int cuartos, String Nombre, String estado, String ingeniero) {
        this.casa = casa;
        this.bloque = bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.comprada = comprada;
        this.pisos = pisos;
        this.baños = baños;
        this.cuartos = cuartos;
        this.Nombre = Nombre;
        this.estado = estado;
        this.ingeniero = ingeniero;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    public String getComprada() {
        return comprada;
    }

    public void setComprada(String comprada) {
        this.comprada = comprada;
    }

    @Override
    public String toString() {
        return "Registro_casas{" + "casa=" + casa + ", bloque=" + bloque +", color=" + color+ ", ancho=" + ancho + ", largo=" + largo + ", comprada=" + comprada+ ", pisos=" + pisos + ", banos=" + baños + ", cuartos=" + cuartos + ", Nombre=" + Nombre + ", estado=" + estado + ", ingeniero=" + ingeniero  ;
    }

    

}
