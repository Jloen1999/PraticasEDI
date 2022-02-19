package noevaluables.sesion0;

public class Peso {
    private double gramos;
    public Peso(){
        gramos=0;
    }
    public Peso(double cantidad, String unidad){
        switch (unidad) {
            case "gr" -> gramos = cantidad;
            case "kg" -> gramos = cantidad * 1000;
            case "lb" -> gramos = cantidad / 0.0022;
            case "oz" -> gramos = cantidad / 0.0353;
        }


    }
    public double getGramos()
    {
        return gramos;
    }
    public double getPeso(){
        return gramos/1000;
    }
    public double getLibras(){
        return gramos*0.0022;
    }
    public double getOnzas(){
        return gramos*0.0353;
    }

    public String  toString(){
        return "Unidades de Masa{" +
                " Peso: " +getPeso()+
                " Libras: " +getLibras()+
                " Onzas: "+getOnzas()+
                "}";
    }
}

