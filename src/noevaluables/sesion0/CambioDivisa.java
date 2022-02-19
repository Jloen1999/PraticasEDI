package noevaluables.sesion0;

public class CambioDivisa {
    private double tipoCambio;
    public CambioDivisa(){
        tipoCambio=0.83;
    }
    public CambioDivisa(double gbp){
        this.tipoCambio=gbp;
    }
    public void setTipoCambio(double gbp){
        this.tipoCambio=gbp;
    }
    public double getTipoCambio(){
        return tipoCambio;
    }
    public double euroToLibra(double e){
        return e*tipoCambio;
    }
    public double libraToEuro(double l){
        return l/tipoCambio;
    }


}