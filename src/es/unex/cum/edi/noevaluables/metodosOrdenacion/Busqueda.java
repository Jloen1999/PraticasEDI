package es.unex.cum.edi.noevaluables.metodosOrdenacion;

public class Busqueda {
	public static void main(String[] args) {
		Busqueda o = new Busqueda();
		int[] a = { 8, 5, 7, 1, 12, 3 };
		if (o.busBinaria(a, 12) != -1)
			System.out.println("Elemento encontrado");

	}

	public int busSecuencial(int a[], int clave) {
		int indice = -1;
		int n = a.length;
		for (int i = 0; i <= n - 1; i++)
			if (a[i] == clave)
				indice = i;
		return indice;
	}

	public int busBinaria(int a[], int clave) {
		int n = a.length;
		int desde = 0, med, hasta = n - 1;
		while (desde <= hasta) {
			med = (desde + hasta) / 2;
			if (clave < a[med])
				hasta = med - 1;
			else if (a[med] < clave)
				desde = med + 1;
			else
				return med;
		}
		return -1;
	}
}
