package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Determina si un numero real tiene decimales

public class ParteDecimal {
    
    private double numero;

    public void setNumero(double n) {
	numero = n;
    }

    public double getNumero() {
	return numero;
    }

    // Devuelve true si el numero tiene parte decimal
    public boolean tieneDecimales() {

	boolean decimales;

	if (numero == Math.round(numero))
		decimales = false;
	else
		decimales = true;

	return decimales;
    }
    
}







