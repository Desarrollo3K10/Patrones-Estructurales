package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade() {
        carrito = new Carrito();
        pago = new Pago();
        envio = new Envio();
    }

    public void comprar(String producto, double precio){
        System.out.println("Iniciando compra...");
        carrito.agregarProducto(producto);
        pago.procesarPago(precio);
        envio.enviar(producto);
        carrito.vaciar();
        System.out.println("Compra finalizada con éxito\n");
    }
}
