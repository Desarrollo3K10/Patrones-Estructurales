package Decorator;

public class DescargasOffline extends Decorator {
    public DescargasOffline(Plan_Basico planBasico) {
        super(planBasico);
    }

    @Override
    public String descripcion(){
        return planBasico.descripcion()+" + Descargas Offline";
    }
    public double costo(){
        return planBasico.costo()+ 700.0;
    }
}


