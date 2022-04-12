package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfredo
 */
public class SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipoSopa = 1;
        Sopa s = null;
        
        switch(tipoSopa) {
            case 1: s = new SopaCuadrada(); break;
            case 2: s = new SopaRectangular(); break;
            case 3: s = new SopaDiagonal(); break;
            case 4: s = new SopaCruz(); break;
        }
        
        s.generar(10,2);
        s.mostrar();
    }
    
}
