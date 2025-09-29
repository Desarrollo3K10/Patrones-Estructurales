package Facade;

public class Carrito {
    public void agregarProducto(String producto) {
        System.out.println("Producto agregado al carrito: " + producto);
    }

    public void vaciar() {
        System.out.println("Carrito vaciado.");
    }
}