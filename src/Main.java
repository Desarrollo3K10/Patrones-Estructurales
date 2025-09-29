import Adapter.*;
import Bridge.*;
import Composite.*;
import Decorator.*;
import Flyweight.*;
import Facade.*;
import Proxy.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=====================================");
        System.out.println("||=========PATRON ADAPTER========||");
        System.out.println("=====================================\n");

        //Creamos un onjeto de usuario
        Printer user1 = new PrinterUser();

        user1.print("pdf","Archivo1.pdf");//Debe imprimir pdf
        user1.print("txt","Archivo2.txt");//Debe imprimir txt
        user1.print("pdf","Archivo3.pdf");//Debe imprimir pdf
        user1.print("txt","Archivo4.txt");//Debe imprimir txt
        user1.print("jpg", "Foto1.jpg");



        System.out.println("\n=====================================");
        System.out.println("||=========PATRON BRIDGE========||");
        System.out.println("=====================================\n");

        CanalEnvio email = new Email();
        CanalEnvio sms = new Sms();

        Notificacion[] notificacions = { //Creamos las notificaciones para los distintos canales
                new Alerta(email),
                new Alerta(sms),
                new Recordatorio(email),
                new Recordatorio(sms),
                new Promocion(email),
                new Promocion(sms)
        };

        String[] mensjaes = {
                "Hemos detectado un problema en tu cuenta de Gmail",
                "Te has quedado sin saldo",
                "Turno Psicologo mañana 9:30 AM",
                "Recordatorio parcial de Sistemas Operativos dia Lunes",
                "Tenes un 20% de descuento usando tarjeta Naranja!",
                "Tenes un 50% de descuento cargando mas de $ 1.000!"
        };

        for (int i =0; i < notificacions.length; i++){
            notificacions[i].enviar(mensjaes[i]);
        }

        System.out.println("\n=====================================");
        System.out.println("||=========PATRON COMPOSITE========||");
        System.out.println("|| MENÚ DEL RESTAURANTE SARACATUNGA|| ");
        System.out.println("=====================================\n");

        // creamos los platos comunes
        Plato gen1 = new Plato("Bife de Chorizo", "Corte de carne a la parrilla");
        Plato gen2 = new Plato("Pollo al Curry", "Pollo con salsa especiada de curry");
        Plato gen3 = new Plato("Sushi Mixto", "Sushi con pescado fresco y vegetales");
        Plato gen4 = new Plato("Costeletas de Cerdo", "Costeletas de cerdo con puré de papas");

        // creamos los platos vegetarianos
        Plato veg1 = new Plato("Hamburguesa Vegana", "Hamburguesa de garbanzos con pan integral");
        Plato veg2 = new Plato("Pizza Margarita", "Pizza con salsa de tomate, mozzarella y albahaca fresca");
        Plato veg3 = new Plato("Tarta de Espinaca", "Tarta rellena de espinaca y ricota");
        Plato veg4 = new Plato("Ensalada Mediterránea", "Ensalada con tomate, pepino y queso feta");


        // menu vegetariano
        Menu menuVegetariano = new Menu("Vegetariano");
        menuVegetariano.addItem(veg1);
        menuVegetariano.addItem(veg2);
        menuVegetariano.addItem(veg3);
        menuVegetariano.addItem(veg4);

        // menu de platos generales
        Menu menuGeneral = new Menu("General");
        menuGeneral.addItem(gen1);
        menuGeneral.addItem(gen2);
        menuGeneral.addItem(gen3);
        menuGeneral.addItem(gen4);

        // menu principal que combina platos vegetarianos con platos generales
        Menu menuPrincipal = new Menu("Restaurante");
        menuPrincipal.addItem(menuVegetariano);
        menuPrincipal.addItem(menuGeneral);

        menuPrincipal.mostrarElementos(" "); //mostramos el menu completo

        System.out.println("\n===============================");
        System.out.println("||======PATRÓN FLYWEIGHT======||");
        System.out.println("===============================\n");

        FabricaArboles fabrica = new FabricaArboles();

        // cremaos los arboles
        fabrica.getArbol("Limonero", "lisa", "blanco");
        fabrica.getArbol("Manzano", "lisa", "blanco");
        fabrica.getArbol("Cerezo", "rugosa", "rosado");
        fabrica.getArbol("Sauce", "rugosa", "marrón");
        fabrica.getArbol("Sauce", "rugosa", "marrón");

        // generams los árboles en pantalla, genere solo 10 por que si no imprime una locura en pantalla
        fabrica.generarArboles(10);


        System.out.println("\n===============================");
        System.out.println("||======PATRÓN DECORATOR======||");
        System.out.println("===============================\n");


        //Creamos un plan basico
        Plan_Basico plan1= new PlanBasicoConcreto();

        //Creamos un plan que sea HD
        Plan_Basico plan2= new PlanBasicoConcreto();
        plan2= new PlanHD(plan2);

        //Creamos un plan que sea Ultra HD +Descargas Offline
        Plan_Basico plan3= new PlanBasicoConcreto();
        plan3= new PlanHD(plan3);
        plan3= new DescargasOffline(plan3);


        //Mostramos resultados en pantalla
        System.out.println(
                "---PLAN 1---\n"+
                        "Descripción: " + plan1.descripcion()+"\n"+
                        "Costo: " + plan1.costo()
        );
        System.out.println(
                "---PLAN 2---\n"+
                        "Descripción: " + plan2.descripcion()+"\n"+
                        "Costo: " + plan2.costo()
        );
        System.out.println(
                "---PLAN 3---\n"+
                        "Descripción: " + plan3.descripcion()+"\n"+
                        "Costo: " + plan3.costo()
        );

        System.out.println("\n===============================");
        System.out.println("||======PATRÓN FACADE==========||");
        System.out.println("===============================\n");

        TiendaFacade tienda = new TiendaFacade();
        tienda.comprar("Notebook", 250000);
        tienda.comprar("Auriculares", 15000);

        System.out.println("\n===============================");
        System.out.println("||======PATRÓN PROXY===========||");
        System.out.println("===============================\n");

        Usuario admin = new Usuario("Admin", true);
        Usuario invitado = new Usuario("Juan", false);

        Archivo archivo1 = new ArchivoProxy("restringido.pdf", admin);
        Archivo archivo2 = new ArchivoProxy("confidencial.docx", invitado);

        archivo1.abrir();
        archivo2.abrir();
    }
}