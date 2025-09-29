package Flyweight;

public class ArbolP implements Arbol{
    //Atributos intrínsecos (se comparten entre árboles iguales)
    private String tipoArbol;
    private String textura;
    private String color;

    public ArbolP(String tipoArbol, String textura, String color) {
        this.tipoArbol = tipoArbol;
        this.textura = textura;
        this.color = color;

    }

    @Override
    public void establecerPosicion(int x, int y) {
        System.out.println("Se estableció la posición del árbol de tipo [" + tipoArbol + "] | Con textura: " + textura +  " | color: " + color + " -> posición (x: " + x + ", y: " + y + ")" );
    }
}