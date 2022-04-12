class ConversorDivisas {

   private double tipoCambio;

   // Constructor sin parámetros: establece tipo de cambio en 0.85
   public ConversorDivisas() {
      tipoCambio = 0.85;
   }

   // Constructor parametrizado para establecer tipo de cambio
   public ConversorDivisas(double tc) {
      tipoCambio = tc;
   }
   
   // Convierte de euros a libras
   public double eurosToLibras(double e) 
   {
      return e*tipoCambio;
   }

   // Convierte de libras a euros
   public double librasToEuros(double d) 
   {
      return d/tipoCambio;
   }
 
   public void setTipoCambio(double tc) {
      tipoCambio = tc;
   }
 
   public double getTipoCambio()
   {
      return tipoCambio;
   }
}
