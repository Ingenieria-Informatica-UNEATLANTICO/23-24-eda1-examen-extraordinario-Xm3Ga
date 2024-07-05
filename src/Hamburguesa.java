package src;

class Hamburguesa {
    private Nodo primero;
    private int tamaño;

    public Hamburguesa() {
        this.primero = null;
        this.tamaño = 0;
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        Nodo nuevoNodo = new Nodo(ingrediente);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        tamaño++;
    }

    public void agregarIngrediente(Ingrediente ingrediente, int posicion) {
        Nodo nuevoNodo = new Nodo(ingrediente);
        if (posicion == 0) {
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        } else {
            Nodo actual = primero;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
        tamaño++;
    }

    public void actualizarIngrediente(int index, Ingrediente nuevoIngrediente) {
        Nodo actual = primero;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        actual.ingrediente = nuevoIngrediente;
    }

    public void quitarIngrediente(int posicion) {
        if (posicion == 0) {
            primero = primero.siguiente;
        } else {
            Nodo actual = primero;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
        }
        tamaño--;
    }

    public void reorganizarIngredientes(int desdePos, int hastaPos) {
        Ingrediente ingrediente = obtenerIngrediente(desdePos);
        quitarIngrediente(desdePos);
        agregarIngrediente(ingrediente, hastaPos);
    }

    private Ingrediente obtenerIngrediente(int posicion) {
        Nodo actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.ingrediente;
    }

    public void mostrar() {
        Nodo actual = primero;
        while (actual != null) {
            actual.ingrediente.mostrar();
            actual = actual.siguiente;
        }
    }

    public String describir() {
        StringBuilder descripcion = new StringBuilder();
        Nodo actual = primero;
        while (actual != null) {
            descripcion.append(actual.ingrediente.describir());
            if (actual.siguiente != null) {
                descripcion.append(", ");
            }
            actual = actual.siguiente;
        }
        descripcion.append("\n");
        return descripcion.toString();
    }
}