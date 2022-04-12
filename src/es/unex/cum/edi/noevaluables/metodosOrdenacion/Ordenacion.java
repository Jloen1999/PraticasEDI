package es.unex.cum.edi.noevaluables.metodosOrdenacion;

public class Ordenacion {
	public static void main(String[] args) {
		Ordenacion o = new Ordenacion();
		int[] a = { 8, 5, 7, 1,12,3 };
		o.quicksort(a, 0, a.length-1);
		o.mostrar(a);
	}

	public void mostrar(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public void ordIntercambio(int a[]) {
		/* Se realizan n-1 pasadas */
		/* a[0], ..., a[n-2] */
		int n = a.length;
		for (int i = 0; i <= n - 2; i++)
			/* coloca mínimo de a[i+1] ... a[n-1] en a[i] */
			for (int j = i + 1; j <= n - 1; j++)
				if (a[i] > a[j]) {
					int aux;
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
	}

	public void ordSeleccion(int a[]) {
		int indiceMenor;
		int n = a.length;
		/* ordenar a[0]...a[n-2] y a[n-1] en cada pasada */
		for (int i = 0; i < n - 1; i++) {
			/* comienzo de la exploración en índice i */
			indiceMenor = i;
			/* j explora la sublista a[i+1]..a[n-1] */
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[indiceMenor])
					indiceMenor = j;
			/* sitúa el elemento más pequeño en a[i] */
			if (i != indiceMenor) {
				int aux = a[i];
				a[i] = a[indiceMenor];
				a[indiceMenor] = aux;
			}
		}
	}

	public void ordInsercion(int[] a) {
		int aux;
		int n = a.length;
		for (int i = 1; i < n; i++) {
			/*
			 * índice j explora la sublista a[i-1]..a[0] buscando la posición
			 * correcta del elemento destino, lo asigna a a[j]
			 */
			int j = i;
			aux = a[i];
			while (j > 0 && aux < a[j - 1]) {
				/* desplazar elementos hacia arriba para hacer espacio */
				a[j] = a[j - 1];
				j--;
			}
			a[j] = aux;
		}
	}

	public void quicksort(int a[], int primero, int ultimo) {
		int i, j, central;
		int pivote;

		central = (primero + ultimo) / 2;
		pivote = a[central];
		i = primero;
		j = ultimo;

		do {
			while (a[i] < pivote)
				i++;
			while (a[j] > pivote)
				j--;

			if (i <= j) {
				int tmp;
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp; /* intercambia a[i] con a[j] */
				i++;
				j--;
			}
		} while (i <= j);

		if (primero < j)
			quicksort(a, primero, j); /* mismo proceso con sublista izqda */

		if (i < ultimo)
			quicksort(a, i, ultimo); /* mismo proceso con sublista drcha */
	}
}
