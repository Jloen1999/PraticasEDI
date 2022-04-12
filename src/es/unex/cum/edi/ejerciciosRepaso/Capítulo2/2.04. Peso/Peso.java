class Peso {
   private double gramos = 0;

   // Constructor. Recibe la cantidad y la unidad de medida.
   // Convierte cualquier unidad a gramos.
   public Peso(double cantidad, String unidad) {
      if (unidad == "gr") gramos = cantidad;
      if (unidad == "kg") gramos = cantidad*1000;
      if (unidad == "lb") gramos = cantidad/0.0022;
      if (unidad == "oz") gramos = cantidad/0.0353;
   }

   // Devuelve el peso en libras
   public double getLibras() {
      return gramos * 0.002205;
   }

   // Devuelve el peso en onzas
   public double getOnzas() { 
      return gramos * 0.035274;
   }

   // Devuelve el peso en kilogramos
   public double getPeso() {
      return gramos / 1000;
   }

   // Devuelve el peso en gramos
   public double getGramos() {
      return gramos;
   }
   
}
