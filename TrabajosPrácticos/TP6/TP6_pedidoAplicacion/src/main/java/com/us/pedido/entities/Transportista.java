package com.us.pedido.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transportista{
    private List<List<String>> cobertura;
    private String email;
    private List<String> vehiculos;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

    public Transportista(String email, List<String> vehiculos, String nombre, String apellido,
                         String dni, String telefono) {
        this.cobertura = new ArrayList<>();
        this.email = email;
        this.vehiculos = vehiculos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public List<List<String>> getCobertura() {
        return cobertura;
    }

    public void setCobertura(List<List<String>> cobertura) {
        this.cobertura = cobertura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<String> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // Método para añadir cobertura
    public void agregarCobertura(String provincia, String localidad) {
        cobertura.add(List.of(provincia, localidad));
    }

    @Override
    public String toString() {
        return "Transportista{" +
                "cobertura=" + cobertura +
                ", email='" + email + '\'' +
                ", vehiculos=" + vehiculos +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
