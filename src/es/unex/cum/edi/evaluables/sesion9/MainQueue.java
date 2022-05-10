package es.unex.cum.edi.evaluables.sesion9;
import java.util.*;
public class MainQueue
{
    public static void main(String[] args) {

        Queue<Integer> qe=new LinkedList<Integer>();
        qe.offer(new Integer(10));
        qe.offer(new Integer(20));
        qe.offer(new Integer(30));
        qe.add(new Integer(40)); //Se puede usar add --> Hereda LinkedList
        qe.add(new Integer(50));
        System.out.println("Tamanio inicial de la cola :"+qe.size());

        //Recorrido como lista. No se pierde la lista
        Iterator it=qe.iterator();
        while(it.hasNext()) {
            Integer iteratorValue=(Integer)it.next();
            System.out.println("Siguiente Valor de la cola :"+iteratorValue);
        }
        // Obtener el frente
        System.out.println("Frente de la cola :"+qe.peek());
        // Obtener el frente eliminando el elemento
        System.out.println("Frente de la cola con eliminacion :"+qe.poll());
        //Recorrido borrando
        while (!qe.isEmpty()){
            Integer value=(Integer)qe.poll();
            System.out.println("Frente de la cola con eliminacion :"+value);
        }
        System.out.println("Tamanio final de la cola :"+qe.size());
    }
}
