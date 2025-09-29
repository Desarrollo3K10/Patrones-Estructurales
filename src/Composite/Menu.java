package Composite;
import java.util.HashSet;

public class Menu implements MenuElemento{
    private String nombreMenu;
    private HashSet<MenuElemento> menu = new HashSet<MenuElemento>();

    public Menu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public void addItem(MenuElemento elemento){
        menu.add(elemento);
    }

    @Override
    public void mostrarElementos(String espaciado) {
        System.out.println(espaciado+"||El menú " + nombreMenu + " contiene los siguientes platos: ");
        for (MenuElemento elemento : menu){
            elemento.mostrarElementos(espaciado+ "   ");
        }
    }
}
