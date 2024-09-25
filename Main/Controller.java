import Components.ComponenteCompuesto;
import Components.Parte;

public class Controller {
    public static void main(String[] args) {
        Vehiculo rueda1 = new Parte("Rueda Delantera Izquierda");
        Vehiculo rueda2 = new Parte("Rueda Delantera Derecha");
        Vehiculo rueda3 = new Parte("Rueda Trasera Izquierda");
        Vehiculo rueda4 = new Parte("Rueda Trasera Derecha");
        Vehiculo piston = new Parte("Pistón");
        Vehiculo bateria = new Parte("Batería");

        // Crear componentes compuestos (motor, ruedas)
        ComponenteCompuesto motor = new ComponenteCompuesto("Motor");
        motor.agregar(piston);
        motor.agregar(bateria);

        ComponenteCompuesto sistemaRuedas = new ComponenteCompuesto("Sistema de Ruedas");
        sistemaRuedas.agregar(rueda1);
        sistemaRuedas.agregar(rueda2);
        sistemaRuedas.agregar(rueda3);
        sistemaRuedas.agregar(rueda4);

        // Crear el vehículo completo
        ComponenteCompuesto vehiculo = new ComponenteCompuesto("Vehículo");
        vehiculo.agregar(motor);
        vehiculo.agregar(sistemaRuedas);

        // Mostrar la estructura del vehículo
        vehiculo.mostrar();
    }
}
