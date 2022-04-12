package es.unex.cum.edi.repaso;
public class Nodo {
   protected Object data;
   protected Nodo enlace;
   public Nodo()
   {
       data=null;
       enlace=null;
   }

   public Nodo(Object inf, Nodo enl){
       this.data=inf;
       this.enlace=enl;
   }
   public void setEnlace(Nodo enlace)
   {
       this.enlace=enlace;
   }
   public Nodo getEnlace()
   {
       return enlace;
   }
   public void setData(Object inf)
   {
       this.data=inf;
   }
   public Object getData()
   {
       return data;
   }

   @Override
   public String toString()
   {
       return "Nodo{" +
               "Data="+getData()+
               "Enlace="+getEnlace();
   }
   @Override
   public boolean equals(Object obj){
       if(this==obj) return true;
       if(this.getClass()!=obj.getClass() || this==null) return false;
       Nodo n=(Nodo) obj;
       return this.getData().equals(n.getData()) && this.getEnlace().equals(n.getEnlace());
   }
}