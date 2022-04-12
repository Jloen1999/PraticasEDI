class TemperaturaPrueba
{
   public static void main(String[] args)
   {
      Temperatura convTemp;
      convTemp = new Temperatura();
      
      convTemp.setCelsius(100);
      convTemp.setFarenheit(212);

      System.out.println(c + " grados Celsius son " + convTemp.celsiusToFarenheit() + " grados Farenheit");
      System.out.println(f + " grados Farenheit son " + convTemp.farenheitToCelsius() + " grados Celsius");
    }
}
