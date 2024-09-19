package com.us.pedido.entities;

public class Direccion {
    public Direccion() {}
    private String provincia;
    private String localidad;
    private String calle;
    private String numero;
    private String otros;

    public Direccion(String provincia, String localidad, String calle, String numero,
                     String otros) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
        this.otros = otros;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    @Override
    public String toString() {
        return  "    - Provincia: " + provincia +
                "\n    - Localidad: " + localidad +
                "\n    - Calle: " + calle +
                "  |  Número: " + numero +
                "\n    - Otros: '" + otros;
    }
}
