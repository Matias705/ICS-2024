package com.us.pedido.entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String tipoCarga;
    private Direccion domicilioRetiro;
    private LocalDate fechaRetiro;
    private Direccion domicilioEntrega;
    private LocalDate fechaEntrega;

    // Constructor vacío
    public Pedido() {}

    // Constructor con parámetros
    public Pedido(String tipoCarga, Direccion domicilioRetiro, LocalDate fechaRetiro,
                  Direccion domicilioEntrega, LocalDate fechaEntrega) {
        this.tipoCarga = tipoCarga;
        this.domicilioRetiro = domicilioRetiro;
        this.fechaRetiro = fechaRetiro;
        this.domicilioEntrega = domicilioEntrega;
        this.fechaEntrega = fechaEntrega;
    }

    // Getters y Setters
    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public Direccion getDomicilioRetiro() {
        return domicilioRetiro;
    }

    public void setDomicilioRetiro(Direccion domicilioRetiro) {
        this.domicilioRetiro = domicilioRetiro;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public Direccion getDomicilioEntrega() {
        return domicilioEntrega;
    }

    public void setDomicilioEntrega(Direccion domicilioEntrega) {
        this.domicilioEntrega = domicilioEntrega;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "tipoCarga='" + tipoCarga + '\'' +
                ", domicilioRetiro=" + domicilioRetiro +
                ", fechaRetiro=" + fechaRetiro +
                ", domicilioEntrega=" + domicilioEntrega +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }

    public String toStringMail() {
        // Formato para "dd MM yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return "\n\n Información del pedido:\n\n" +
                "  *  Tipo de carga: " + tipoCarga + "\n" +
                "\n  *  Domicilio de retiro: \n" + domicilioRetiro.toString() +
                "\n\n  *  Fecha de retiro: " + fechaRetiro.format(formatter)  +
                "\n\n  *  Domicilio de entrega: \n" + domicilioEntrega.toString() +
                "\n\n  *  Fecha de entrega: " + fechaEntrega.format(formatter);
    }


    public List<Transportista> verificarCobertura(List<Transportista> transportistas){
        List<Transportista> transportistasConCobertura = new ArrayList<>();
        List<String> domicilio = new ArrayList<>();
        domicilio.add(this.getDomicilioRetiro().getProvincia());
        domicilio.add(this.getDomicilioRetiro().getLocalidad());
        System.out.println("Domicilio"+domicilio);
        for(Transportista trans : transportistas){
            if (trans.getCobertura().contains(domicilio)) {
                transportistasConCobertura.add(trans);
            }
        }
        return transportistasConCobertura;
    }
}
