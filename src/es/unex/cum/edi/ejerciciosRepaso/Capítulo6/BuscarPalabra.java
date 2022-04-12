package es.unex.cum.edi.ejerciciosRepaso.Capítulo6;

import java.io.*;

public class BuscarPalabra {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("entrada.txt");
            br = new BufferedReader(fr);
            String palabraBuscada = "pantufla";
            String linea = null;   // Leeremos líneas completas gracias al BufferedReader
            int numLinea = 1;
            
            while ((linea = br.readLine())!=null) {
                if (linea.contains(palabraBuscada)) {
                    System.out.format("Línea %d: %s\n", numLinea, linea);
                }
                numLinea++;
            }
            fr.close();
        }
        catch (Exception e) { e.printStackTrace(); }

    }
}
