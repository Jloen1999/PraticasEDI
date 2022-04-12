//package es.unex.cum.edi.ejerciciosRepaso.Capítulo5;
//
//class Matriz {
//
//
//	private int N = 4;   // Tamaño de la martriz cuadrada
//	private int[][] m;         // Matriz
//
//	public Matriz() {
//		int f, c;
//		m = new int[N][N];
//
//		// Rellenamos la matriz con números al azar
//		for (f = 0; f < N; f++)
//			for (c = 0; c < N; c++)
//				m[f][c] = (int)(Math.random() * 10);
//
//	}
//
//
//	/** Muestra por la pantalla la matriz
//          */
//	public void mostrar() {
//		int f, c;
//
//		for (f = 0; f < N; f++) {
//			for (c = 0; c < N; c++) {
//				System.out.format("%4d", m[f][c]);
//			}
//			System.out.println();
//		}
//
//	}
//
//	/** Muestra el perímetro de la matriz
//          */
//	public void perimetro() {
//	    perimetro(0, N, 0, N);
//	}
//
//	/** Muestra el perímetro de la matriz
//          */
//	public void perimetro(izq, der, arr, aba) {
//		int f, c;
//
//		System.out.println("El perímetro es:\n");
//
//		/* Mostramos fila superior (de izquierda a derecha) */
//		for (c = izq; c < der; c++)
//			System.out.print(m[arr][c] + " ");
//		/* Mostramos columna derecha (de arriba a abajo) */
//		for (f = arr + 1; f < aba; f++)
//			System.out.print(m[f][der-1] + " ");
//		/* Mostramos fila inferior (de derecha a izquierda) */
//		for (c = der-2; c >= izq; c--)
//			System.out.print(m[aba-1][c] + " ");
//		/* Mostramos columna izquierda (de abajo a arriba) */
//		for (f = aba-2; f >= arr+1; f--)
//			System.out.print(m[f][izq] + " ");
//
//		System.out.println();
//	}
//
//
//	/** Muestra la espiral de la matriz.
//	  * Para lograrlo, hacemos un perímetro de la matriz completa y luego
//	  * vamos acotando los límites para hacer un perímetro de la matriz
//	  * interna.
//          */
//	void espiral()
//	{
//		int f, c, cont, izq, der, arr, aba;
//
//		System.out.println("La espiral es:");
//
//		izq = 0; 	/* Límites del perímetro */
//		der = N;
//		arr = 0;
//		aba = N;
//
//		for (cont = 0; cont <= N/2; cont++)
//		{
//			perimetro(izq, der, arr, aba);
//			izq++; 		/* Actualizamos límites del perímetro */
//			der--;
//			arr++;
//			aba--;
//		}
//
//		System.out.println();
//	}
//
//}
