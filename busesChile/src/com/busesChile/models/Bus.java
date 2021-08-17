package com.busesChile.models;

public class Bus {

    private String patente;
    private int[] asientosDisponibles;

    public Bus() {
        asientosDisponibles= new int[40];
    }

    public Bus(String patente, int[] asientosDisponibles) {
        this.patente = patente;
        this.asientosDisponibles = asientosDisponibles;
    }
}
