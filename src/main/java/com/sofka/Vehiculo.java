package com.sofka;

public class Vehiculo {
    private String nombre;
    private String marca;
    private int telefono;
    private int placa;
    Vehiculo(String nombre, String marca, int telefono, int placa) {
        this.nombre = nombre;
        this.marca = marca;
        this.telefono = telefono;
        this.placa = placa;
    }
    public int getPlaca() {
        return placa;
    }

    public String toString() {
        return "Nombre de Usuario: " + nombre + " Telefono: " + telefono + " Marca: " + marca + " Placa: " + placa;
    }
}
