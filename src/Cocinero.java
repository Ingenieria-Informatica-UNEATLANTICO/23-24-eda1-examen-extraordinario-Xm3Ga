package src;

class Cocinero extends Empleado {
    public void prepararHamburguesa() {
        System.out.println("Iniciando la preparación de la hamburguesa...");
        hamburguesa = new Hamburguesa();
        
        System.out.println("\n1. Agregando ingredientes básicos:");
        hamburguesa.agregarIngrediente(new Brioche());
        hamburguesa.agregarIngrediente(new Res("poco hecha"));
        hamburguesa.agregarIngrediente(new Cheddar());
        System.out.println(hamburguesa.describir());
        
        System.out.println("\n2. Agregando Ketchup en la posición 1:");
        hamburguesa.agregarIngrediente(new Ketchup("poco"), 1);
        System.out.println(hamburguesa.describir());
        
        System.out.println("\n3. Actualizando la carne de Res por Pollo en la posición 2:");
        hamburguesa.actualizarIngrediente(2, new Pollo("bien hecho"));
        System.out.println(hamburguesa.describir());
        
        System.out.println("\n4. Agregando más ingredientes:");
        hamburguesa.agregarIngrediente(new Mayonesa("mucho"));
        hamburguesa.agregarIngrediente(new Huevo());
        hamburguesa.agregarIngrediente(new Brioche());
        System.out.println(hamburguesa.describir());
        
        System.out.println("\n5. Quitando el Cheddar (posición 3):");
        hamburguesa.quitarIngrediente(3);
        System.out.println(hamburguesa.describir());
        
        System.out.println("\n6. Moviendo el Huevo (posición 4) después del Ketchup (a la posición 1):");
        hamburguesa.reorganizarIngredientes(4, 1);
        System.out.println(hamburguesa.describir());
        
        this.tieneHamburguesa = true;
        
        System.out.println("\nHamburguesa final:");
        System.out.println(hamburguesa.describir());
        
        System.out.println("\nRepresentación visual de la hamburguesa final:");
        hamburguesa.mostrar();
    }

    public Hamburguesa entregar() {
        System.out.println("\nEntregando la hamburguesa al camarero...");
        this.tieneHamburguesa = false;
        return hamburguesa;
    }
}