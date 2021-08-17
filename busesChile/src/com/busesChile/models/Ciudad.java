package com.busesChile.models;

public class Ciudad {
    String nombre;
    String Region;

    public Ciudad(String nombre, String region) {
        this.nombre = nombre;
        Region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    @Override
    public String toString() {
        return "com.busesChile.models.Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", Region='" + Region + '\'' +
                '}';
    }
}
