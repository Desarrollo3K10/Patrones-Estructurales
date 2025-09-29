package Decorator;

public class PlanBasicoConcreto implements Plan_Basico {
@Override
    public String descripcion(){
    return "Plan Básico";
}
@Override
    public double costo(){
    return 1000.0;
}
}
