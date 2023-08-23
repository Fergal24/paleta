// Clase base "Paleta"
class Paleta {
    protected String sabor;
    protected double precio;

    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: $" + precio);
    }
}

// Clase derivada "PaletaAgua"
class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Base de agua: " + (baseAgua ? "Sí" : "No"));
    }
}

// Clase derivada "PaletaCrema"
class PaletaCrema extends Paleta {
    public PaletaCrema(String sabor, double precio) {
        super(sabor, precio);
    }
}