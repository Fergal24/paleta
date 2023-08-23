public class Paleteria {
    public static void main(String[] args) {
        // Crear paletas de agua y paletas de crema
        PaletaAgua paletaAgua1 = new PaletaAgua("Fresa", 15.0, true);
        PaletaAgua paletaAgua2 = new PaletaAgua("Mango", 20.0, false);
        PaletaCrema paletaCrema1 = new PaletaCrema("Chocolate", 25.0);
        PaletaCrema paletaCrema2 = new PaletaCrema("Vainilla", 18.0);

        // Mostrar información de las paletas
        System.out.println("Paleta de Agua 1:");
        paletaAgua1.mostrarInformacion();

        System.out.println("\nPaleta de Agua 2:");
        paletaAgua2.mostrarInformacion();

        System.out.println("\nPaleta de Crema 1:");
        paletaCrema1.mostrarInformacion();

        System.out.println("\nPaleta de Crema 2:");
        paletaCrema2.mostrarInformacion();
    }
}
