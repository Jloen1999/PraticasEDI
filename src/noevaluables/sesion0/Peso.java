package noevaluables.sesion0;

public class Peso {
    private double gramos;
    public Peso(){
        gramos=0;
    }
    public Peso(double cantidad, char unidad){
        String result="";
        result=switch (unidad) {
            case 'g' -> ""+cantidad;
            case 'k' -> ""+cantidad * 1000;
            case 'l' -> ""+cantidad / 0.0022;
            case 'o' -> ""+cantidad / 0.0353;
            default -> throw new IllegalStateException("Unexpected value: " + unidad);
        };
       gramos=Double.parseDouble(result);

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

