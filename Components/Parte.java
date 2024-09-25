package Components;

import Interface.Vehiculo;

public class Parte implements Vehiculo{
    private String nombre;

    public Parte(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Parte: " + nombre);
    }
}
