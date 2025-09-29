package Proxy;

// Se simuló un usuario con un rol para controlar permisos
public class Usuario {
    private String nombre;
    private boolean tienePermiso;

    public Usuario(String nombre, boolean tienePermiso) {
        this.nombre = nombre;
        this.tienePermiso = tienePermiso;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean tienePermiso() {
        return tienePermiso;
    }
}
