package es.unex.cum.edi.ejerciciosRepaso.Capítulo3;

class Calculadora {

    public static double suma(double n1, double n2) {
        double r = n1 + n2;
        return r;
    }

    public static double resta(double n1, double n2) {
        double r = n1 - n2;
        return r;
    }

    public static double divide(double n1, double n2) {
        double r = 0;
        if (n2 == 0) {
            System.out.println(“Error de división por cero”);
        } else {
            r = n1 / n2;
        } 
        return r;
    }

    public static double multiplica(double n1, double n2) {
        double r = n1 * n2;
        return r;
    }

}
