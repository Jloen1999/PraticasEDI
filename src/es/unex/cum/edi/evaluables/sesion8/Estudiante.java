package es.unex.cum.edi.evaluables.sesion8;


public class Estudiante {
	protected String nombre;
	protected int exp;	
	protected Lista lista;
	
	public Estudiante(String nombre, int exp) {
		this.nombre = nombre;
		this.exp = exp;
		lista=new Lista();
	}
	public Estudiante() {
		lista=new Lista();
		nombre="";
		exp=-1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Lista getLista() {
		return lista;
	}
	public void setLista(Lista lista) {
		this.lista = lista;
	}
	@Override
	public String toString() {
		return "es.unex.cum.edi.ejerciciosRepaso.Capítulo5.Estudiante [nombre=" + nombre + ", exp=" + exp + ", lista=" + lista + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + exp;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (exp != other.exp)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public boolean addAsignatura(Asignatura a) {
		return lista.insertarAlPrincipio(a);		
	}
	
}
