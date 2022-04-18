package es.unex.cum.edi.repaso;
import static java.lang.Math.*;
public class ConversionBits {
    private double cantidad;
    private String unidad;

    public ConversionBits()
    {
        cantidad=0;
        unidad="bit";
    }

    public ConversionBits(double cantidad, String unidad){
        this.cantidad=cantidad;
        this.unidad=unidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad=cantidad;
    }
    public void setUnidad(String unidad)
    {
        this.unidad=unidad;
    }
    public double getCantidad()
    {
        return cantidad;
    }
    public String getUnidad()
    {

       return unidad;
    }

    public double getBit(double cant) {
        if (unidad.substring(0,1).equalsIgnoreCase("kb")) {
            setCantidad((getCantidad() * pow(10, 3)));
        } else if (unidad.substring(0, 2).equalsIgnoreCase("Mb")) {
            setCantidad((getCantidad() * pow(10, 6)));
        } else if (unidad.substring(0, 2).equalsIgnoreCase("Gb")) {
            setCantidad((getCantidad() * pow(10, 9)));
        } else if (unidad.substring(0, 2).equalsIgnoreCase("Tb")) {
            setCantidad((getCantidad() * pow(10, 12)));
        } else if (unidad.substring(0, 2).equalsIgnoreCase("Pb")) {
            setCantidad((getCantidad() * pow(10, 15)));
        } else if (unidad.substring(0, 2).equalsIgnoreCase("Eb")) {
            setCantidad((getCantidad() * pow(10, 18)));
        } else if (unidad.substring(0, 2).equalsIgnoreCase("Zb")) {
            setCantidad((getCantidad() * pow(10, 21)));
        } else if (unidad.substring(0, 2).equalsIgnoreCase("Yb")) {
            setCantidad((getCantidad() * pow(10, 24)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("kibib")) {
            setCantidad((getCantidad() * pow(2, 10)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("Mibib")) {
            setCantidad((getCantidad() * pow(2, 20)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("Gibib")) {
            setCantidad((getCantidad() * pow(2, 30)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("Tibib")) {
            setCantidad((getCantidad() * pow(2, 40)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("Pibib")) {
            setCantidad((getCantidad() * pow(2, 50)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("Eibib")) {
            setCantidad((getCantidad() * pow(2, 60)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("Zibib")) {
            setCantidad((getCantidad() * pow(2, 70)));
        } else if (unidad.substring(0, 5).equalsIgnoreCase("Yibib")) {
            setCantidad((getCantidad() * pow(2, 80)));
        }


    if(unidad.charAt(unidad.length()-2)=='y') {
       setCantidad(getCantidad()*8);
    }
            unidad="bits";
         return getCantidad();
    }

    public double getMegaBit(int tipo)
    {
        if(tipo==1){
            return (getCantidad()/pow(10,6));
        }else{
            return (getCantidad()/pow(10,6)/8);
        }
    }

    public double getGigaBit()
    {
        return (getCantidad()/pow(10,9));
    }
}