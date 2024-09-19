package com.us.pedido;
import com.us.pedido.entities.Transportista;
import java.util.ArrayList;
import java.util.List;

public class Mock {

    public List<Transportista> crearTransportistas(){
        List<Transportista> transportistas = new ArrayList<>();
        // Crear la lista de vehículos

        List<String> vehiculos = new ArrayList<>();
        vehiculos.add("Camión 1");
        vehiculos.add("Camión 2");
        // Creamos un transportista con cobertura en diferentes provincias y localidades
        Transportista trans = new Transportista(
                "bocamati98@gmail.com",
                vehiculos,
                "Juan",
                "Cruz",
                "12345678A",
                "555-1234"
        );

        Transportista trans2 = new Transportista(
                "juancruzled@gmail.com",
                vehiculos,
                "Candelaria",
                "Zamora",
                "44829068",
                "555-1234"
        );

        // Añadimos áreas de cobertura
        trans.agregarCobertura("Buenos Aires", "La Plata");
        trans.agregarCobertura("Santa Fe", "Rosario");
        trans2.agregarCobertura("Chaco", "Resistencia");
        trans2.agregarCobertura("Buenos Aires", "La Plata");
        trans2.agregarCobertura("Córdoba", "Villa María");
        System.out.println("Transportista creado: "+ trans.toString());
        transportistas.add(trans);
        transportistas.add(trans2);
        return transportistas;
    }

}
