package com.busesChile.controlllers;

import com.busesChile.models.Ciudad;

import java.util.ArrayList;

public  class VentaController {

    public  String mostrarCiudades() {
        String salida = "";
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();
        //Se crean las ciudades
        listaCiudades.add(new Ciudad("Temuco", "Novena"));
        listaCiudades.add(new Ciudad("Santiago", "Metropolitana"));
        listaCiudades.add(new Ciudad("Puerto Montt", "Los Lagos"));
        listaCiudades.add(new Ciudad("Arica", "Arica"));
        listaCiudades.add(new Ciudad("Loncoche", "Novena"));
        listaCiudades.add(new Ciudad("Valdivia", "Los Rios"));

        for (int i =0;i<6;i++) {
            salida += listaCiudades.get(i).getNombre() +"  "+listaCiudades.get(i).getRegion()+ "\n";
        }
        return  salida;

    }

    public void reservaDePasaje(){
        
    }
}

