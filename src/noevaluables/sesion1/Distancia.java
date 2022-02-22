package noevaluables.sesion1;

public class Distancia {
    private double millas;
    public Distancia(){
        millas=0;
    }

    public void setMillas(double millas)
    {
        this.millas=millas;
    }
    public double getMillas()
    {
        return millas;
    }

    public double getMillasToMetros(){
        return millas*1609.34;
    }
    public double getMillasToKilometros()
    {
        return millas*1.60934;
    }

    public String toString()
    {
        return "Distancias{" +
                "Millas=" +millas+
                "Metros=" +getMillasToMetros()+
                "Kilometros" +getMillasToKilometros()+
                "}";
    }
}
