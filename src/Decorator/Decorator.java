package Decorator;

public abstract class Decorator implements Plan_Basico{
    protected Plan_Basico planBasico;//Asociación

    public Decorator(Plan_Basico planBasico) {
        this.planBasico = planBasico;
    }


    @Override//Implementamos métodos de la interfaz
    public String descripcion(){
    //El decorador no tiene descripción propia así que usa "de base" la de la clase concreta Plan Basico
    return planBasico.descripcion();
}
    @Override
    public double costo() {
        return planBasico.costo();       // delega al plan que contiene
    }
}