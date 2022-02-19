package noevaluables.sesion0;

public class Temperatura {
    private double tempC,tempF;
    public void setTempC(double c){
        this.tempC=c;
    }
    public void setTempF(double f){
        this.tempF=f;
    }
    public double getTempC(){
        return tempC;
    }
    public double getTempF(){
        return tempF;
    }

    public double celsiusToFarenheit(){
        return (tempF-32)/1.8;
    }
    public double farenheitToCelsius(){
        return (1.8*tempC)+32;
    }

}
