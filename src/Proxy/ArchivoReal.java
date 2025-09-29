package Proxy;

public class ArchivoReal implements Archivo {
    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo archivo: " + nombre);
    }
}

