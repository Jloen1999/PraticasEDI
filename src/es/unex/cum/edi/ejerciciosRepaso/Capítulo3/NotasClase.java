package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;// Calcula suspensos y aprobados en una clase

public class NotasClase {

    private int numSuspensos = 0;
    private int numAprobados = 0;

    public void addNota(int n) { 
        if (n >= 5) numAprobados++;
	else numSuspensos++;
    }

    public int getNumSuspensos() {
        return numSuspensos;
    }

    public int getNumAprobados() {
        return numAprobados;
    }
   
}
