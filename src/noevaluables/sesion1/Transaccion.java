package noevaluables.sesion1;

import java.util.Date;

public class Transaccion {
    protected double d;
    protected Date f;

    public Transaccion(double d,Date f) {
        this.d = d;
        this.f=f;
    }
    public Transaccion(){

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

    @Override
    public String toString() {
        return "Transaccion{" +
                "d=" + d +
                ", f=" + f +
                '}';
    }
}
