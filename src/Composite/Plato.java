package Composite;

public class Plato implements MenuElemento {
    private String nombrePlato;
    private String descripcion;

   public Plato(String nombrePlato, String descripcion) {
    this.nombrePlato = nombrePlato;
    this.descripcion = descripcion;
}


    @Override
    
    public void mostrarElementos(String espaciado) {
        System.out.println(espaciado + "-> Nombre: " + nombrePlato + ". Descripcion: " + descripcion);
    }
}
