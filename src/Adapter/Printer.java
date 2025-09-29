package Adapter;

//Declaramos la interfaz
public interface Printer {
    //El void nos mostrará el tipo de archivo (pdf o text) y el nombre)
    void print(String fileType, String fileName);
}
