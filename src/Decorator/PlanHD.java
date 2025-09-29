package Decorator;

public class PlanHD extends Decorator{
    public PlanHD(Plan_Basico planBasico) {
        super(planBasico);
    }
    @Override
    public String descripcion(){
    return planBasico.descripcion()+" + HD";
    }
    public double costo(){
    return planBasico.costo()+ 500.0;
    }
}
