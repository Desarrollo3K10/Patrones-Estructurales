package Decorator;

public class PlanUltraHD extends Decorator {
    public PlanUltraHD(Plan_Basico planBasico) {
        super(planBasico);
    }

    @Override
        public String descripcion(){
        return planBasico.descripcion()+" + Ultra HD";
    }
    @Override
        public double costo(){
            return planBasico.costo()+ 1000.0;
        }
    }


