package src;

class Cocinero extends Empleado {
    public void prepararHamburguesa() {
        hamburguesa = new Hamburguesa();
        hamburguesa.agregarIngrediente(new Brioche());
        hamburguesa.agregarIngrediente(new Res("poco hecha"));
        hamburguesa.agregarIngrediente(new Cheddar());
        hamburguesa.agregarIngrediente(new Ketchup("poco"));
        hamburguesa.agregarIngrediente(new Mayonesa("mucho"));
        hamburguesa.agregarIngrediente(new Huevo());
        hamburguesa.agregarIngrediente(new Brioche());
        this.tieneHamburguesa = true;
    }

    public Hamburguesa entregar() {
        this.tieneHamburguesa = false;
        return hamburguesa;
    }
}
