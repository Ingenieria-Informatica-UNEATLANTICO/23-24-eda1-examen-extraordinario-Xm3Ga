package src;

import java.util.ArrayList;
import java.util.List;

class Hamburguesa {
    private List<Ingrediente> ingredientes;

    public Hamburguesa() {
        this.ingredientes = new ArrayList<>();
    }

    
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarIngrediente(Ingrediente ingrediente, int posicion) {
        ingredientes.add(posicion, ingrediente);
    }

    
    public void actualizarIngrediente(int index, Ingrediente nuevoIngrediente) {
        ingredientes.set(index, nuevoIngrediente);
    }

    
    public void quitarIngrediente(int posicion) {
        ingredientes.remove(posicion);
    }

    public void reorganizarIngredientes(int desdePos, int hastaPos) {
        Ingrediente ingrediente = ingredientes.remove(desdePos);
        ingredientes.add(hastaPos, ingrediente);
    }

    
    public void mostrar() {
        for (Ingrediente ingrediente : ingredientes) {
            ingrediente.mostrar();
        }
    }

    public String describir() {
        StringBuilder descripcion = new StringBuilder();
        for (int i = 0; i < ingredientes.size(); i++) {
            descripcion.append(ingredientes.get(i).describir());
            if (i < ingredientes.size() - 1) {
                descripcion.append(", ");
            }
        }
        descripcion.append("\n");
        return descripcion.toString();
    }
}
