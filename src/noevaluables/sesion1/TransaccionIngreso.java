package noevaluables.sesion1;

import java.util.Date;

public class TransaccionIngreso extends Transaccion{
    protected String concepto;

    public TransaccionIngreso(){
        super();
        concepto=new String("Sin concepto");
    }
    public TransaccionIngreso(double d, Date f,String c){
        super(d,f);
        this.concepto=c;
    }

    public String getConcepto(){
        return concepto;
    }
    public void setConcepto(String c){
        this.concepto=c;
    }

    @Override
    public String toString() {
        return "TransaccionIngreso{" +
                "d=" + d +
                ", f=" + f +
                ", concepto='" + concepto + '\'' +
                '}';
    }
}
