package evaluables.Newsesion5;

public class Palabra{
	protected String texto;
	protected String pista;
	protected int longitud;

	public Palabra(){
		texto=new String();
		pista=new String();
		longitud=0;
	}

	public Palabra(String t, String p){
		texto=t;
		pista=p;
		longitud=texto.length();
	}

	public void setTexto(String texto){
		this.texto=texto;
		setLongitud(texto.length());
	}
	public void setPista(String pista)
	{
		this.pista=pista;

	}
	public void setLongitud(int longitud){
		this.longitud=longitud;
	}
	public String getTexto()
	{
		return texto;
	}
	public String getPista()
	{
		return pista;
	}
	public int getLongitud()
	{
		return longitud;
	}

	public String toString()
	{
		return "Palabra ["+
				"texto="+ this.getTexto()+ ", pista="+this.getPista()+", longitud="+this.getLongitud()+"]";
	}

	public boolean equals(Object o)
	{
		if(this==o) return true;
		if(getClass()!=o.getClass()) return false;
		Palabra p=(Palabra)o;
		return this.texto.equals(p.texto) && this.pista.equals(p.pista) && this.longitud==p.longitud;
	}


}