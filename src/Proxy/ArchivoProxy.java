package Proxy;

public class ArchivoProxy implements Archivo {
    private ArchivoReal archivoReal;
    private String nombreArchivo;
    private Usuario usuario;

    public ArchivoProxy(String nombreArchivo, Usuario usuario) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
    }

    @Override
    public void abrir() {
        if (usuario.tienePermiso()) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo);
            }
            System.out.println("Acceso concedido a " + usuario.getNombre());
            archivoReal.abrir();
        } else {
            System.out.println("Acceso DENEGADO para el usuario: " + usuario.getNombre());
        }
    }
}

