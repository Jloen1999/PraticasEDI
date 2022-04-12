package es.unex.cum.edi.ejerciciosRepaso.Capítulo4;

public class PerroGatoPrueba
{
    public static void main(String[] args) 
    {
	Perro p = new Perro("Bobby", 4, "Chihuahua");	
	Gato g = new Gato("Rocky", 3);	
	
	p.setRaza("Pastor alemán");
	g.quitaVida(); 
	
	System.out.println(p.toString());
	System.out.println(g.toString());
    }
}
