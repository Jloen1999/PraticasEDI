package noevaluables.sesion1;

import java.util.Date;
import java.util.Objects;

public class Transaccion {
    protected double d;
    protected Date f;

    public Transaccion(double d, Date f) {
        this.d = d;
        this.f = f;
    }

    public Transaccion() {

    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public Date getF() {
        return f;
    }

    public void setF(Date f) {
        this.f = f;
    }

    //Metodo para aplicar el 10%

    @Override
    public String toString() {
        return "Transaccion{" +
                "d=" + d +
                ", f=" + f +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaccion that = (Transaccion) o;
        return Double.compare(that.d, d) == 0 && Objects.equals(f, that.f);
    }

}