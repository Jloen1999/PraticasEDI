package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfredo
 */
public class Sopa {
    protected int ancho, alto;
    protected char sopa[][];
    
    public void generar(int an, int al) {
        
        ancho = an;
        alto = al;
        sopa = new char[al][an];

        for (int f = 0; f < alto; f++) {
            for (int c = 0; c < ancho; c++) {
                sopa[f][c] = (char)(Math.random()*26+65);
            }
        }
    }
    
    public void mostrar() {
        for (int f = 0; f < alto; f++) {
            for (int c = 0; c < ancho; c++) {
                System.out.print(sopa[f][c] + " ");
            }
            System.out.println();
        }
        
    }
}
