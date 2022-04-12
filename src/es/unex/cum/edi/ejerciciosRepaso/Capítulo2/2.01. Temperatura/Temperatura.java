class Temperatura {
   private double tempF, tempC;

   public void setFarenheit(double f) {
      tempF = f;
   }

   public void setCelsius(double c) {
      tempC = c;
   }

   // Convierte de grados C a grados F
   public double celsiusToFarenheit() {
      return (1.8*tempC)+32;
   }

   // Convierte de grados F a grados C
   public double farenheitToCelsius() {
      return (tempF-32)/1.8;
   }
}
