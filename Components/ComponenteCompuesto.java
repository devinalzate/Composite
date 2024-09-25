import java.util.*;

package Components;

import Interface.Vehiculo;

public class ComponenteCompuesto implements Vehiculo{

    private String nombre;
    private ArrayList<Vehiculo> componentes = (Vehiculo) new ArrayList();

    public ComponenteCompuesto(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Vehiculo componente) {
        componentes.add(componente);
    }

    public void remover(Vehiculo componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
