package noevaluables.sesion0;

// Un ejemplo del alcance.
public class Alcance {
	

   // Variable que es accesible para todo el programa
   static int x = 1;

   public static void main(String[] args) {

	if (x==1){
		int y = 5;   // variable local 		
		System.out.println( "Valor de y local es " + y );
		
		usarLocal();  // usarLocal tiene x local
		usarGlobal(); // userGlobla utiliza el campo x de Alcance
		usarLocal();  // usarLocal inicializa la variable local x
		usarGlobal(); // Campo x de Alcance retiene su valor
		
	} // fin del método start
   }
	
   // usarLocal crea e inicializa la variable local x durante cada llamada
   static void usarLocal() {

	int x = 25;  // se inicializa cada vez que se hace una llamada a usarLocal
		
	System.out.println( "\n\nx local en usarLocal es " + x +" después de entrar a usarLocal" );
	x++;
	System.out.println( "\nx local en usarLocal es " + x +" después de salir de usarLocal" );
		
   } // fin del método usarLocal
	
   // usarGlobal modifica la variable x de Alcance durante cada llamada
   static void usarGlobal() {
	System.out.println( "\n\nla variable x es " + x +" al entrar a usarGlobal" );
	x *= 10;
	System.out.println( "\nla variable x es " + x +" al salir de usarGlobal" );
   } // fin el método usarGlobal

}; // fin de la clase Alcance
