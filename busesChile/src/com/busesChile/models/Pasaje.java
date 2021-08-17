package com.busesChile.models;

import java.util.Date;

public class Pasaje {

    private Integer codigoPasaje;
    private Date fechaSalida;
    private Date fechaLimitePago;
    private boolean estadoDePago=false;
    private String lugarDeSubida;
    private Double valorPasaje;
    private Bus asiento;
    private String acompanantes;
    private Ciudad ciudadDestino;
    private Ciudad ciudadOrigen;

}
