package es.unex.cum.edi.noevaluables.sesion7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
public class SegundoEjemplo {
    public SegundoEjemplo() throws IOException {
    }

    public static void main(String[] args) {
        //1 definir e instaciar una lista
        List l = new ArrayList();
        // 2. Rellenar con números aleatorios
        Random r = new Random();

        Integer valor;
        Random rand = new Random();
        System.out.print("Anadiendo los valores: ");
        for (int i = 0; i < 10; i++) {
            valor = (rand.nextInt(100));
            System.out.print(valor.toString() + " ");
            l.add(valor);
        }
        System.out.println();
        // 3. Mostrar
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Integer x = (Integer) it.next(); // Always upcasting
            System.out.println(x);
        }
        // 4. Procesar. Media

        // 5. Calcular mayor

    }

}