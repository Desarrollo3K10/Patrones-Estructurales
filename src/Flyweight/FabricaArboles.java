package Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FabricaArboles {

    private HashMap<String,Arbol> arboles = new HashMap<>();
    private List<String> keys=new ArrayList<>();  // Lista de claves usadas para seleccionar árboles aleatoriamente

    public Arbol getArbol(String tipoArbol, String textura, String color){
        //hacemos una llave compuesta de tres atributos
        String key = tipoArbol + textura + color;
        Arbol arbol = arboles.get(key); // Buscamos si ya existe ese arbol en el mapa

        if (arbol==null){ //si es null(no existe el arbol) creo el elemento
            arbol = new ArbolP(tipoArbol,textura,color);
            arboles.put(key,arbol);
            keys.add(key);
        }

       // Devolvemos el arbol como si fuese un sout
        return arbol;
    }

    public void generarArboles(int cantidad){
        int x=0,y=0;
        for (int i = 0; i < cantidad; ++i) {
            Arbol arbol = arboles.get(keys.get((int) (Math.random() * keys.size())));
            arbol.establecerPosicion(x,y);  // Asignamos una posición al arbol
            x=x+1; // Movemos la posición  para el siguiente árbol
            y=y+5;
        }
    }
}
