package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfredo
 */
public class SopaCuadrada extends Sopa {
    public void generar(int an, int al) {
        super.generar(an, an);
    }
    
    public void generar(int tam) {
        super.generar(tam, tam);
    }
    
}
