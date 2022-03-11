package unex.cum.edi.practica.tablero;

import unex.cum.edi.practica.celda.CeldaMinas;

import java.util.Arrays;
import java.util.Random;

public class TableroMinas extends Tablero{
    //Declaraciones
    private int numMaximo;//número máximo de minas
    private Random r=new Random();
    boolean[] vb=new boolean[20-1];
    /**
     * @Description Constructor por defecto, inicializa todas las variables miembro a atributos, incluido
     */
    public TableroMinas()
    {
        super();
        numMaximo=20;
    }

    /**
     * @Description Constructor parametrizado
     * @param numFilas Es de tipo entero
     * @param numColumnas Es de tipo entero
     * @param numMaximo Es de tipo entero
     */
    public TableroMinas(int numFilas, int numColumnas) {
        super(numFilas , numColumnas);
        this.numMaximo = 20;
    }

    /**
     * @Description devuelve el numero máximo de minas
     * @return numMaximo Devuelve un valor de tipo entero
     */
    public int getNumMaximo() {
        return numMaximo;
    }

    /**
     * @Description Se encarga de inicializar el tablero a las celdas (será llamado
     * desde el constructor de la clase derivada)
     */
    public void inicializar(){
      for(int i=0; i<numFilas; i++) {
          for(int j=0; j<numColumnas; j++) {
                 tablero[i][j]=new CeldaMinas(i,j);
          }
      }
    }

    /**
     * @Description Inicializa el vector booleano con todas las casillas a false
     */
    public void inicializarVector()
    {
        Arrays.fill(vb, false); //Es lo mismo que rellenar el array de booleanos a false con el for
    }

    /**
     *@Description Método repartir de la clase Tablero. Asignamos números a todas
     * las celdas del tablero, cuyos números son generados de forma aleatoria
     * Modificamos también los estados de las celdas que están ocupadas en el
     * tablero, cuyo estado ponemos a 1 (número en carton)
     *
     */
    public void repartir() {
        int aleatorio;
        inicializarVector();

        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                aleatorio = r.nextInt(numMaximo) + 1;
                while (vb[aleatorio - 1]) {
                    aleatorio = r.nextInt(numMaximo) + 1;
                }

                vb[aleatorio - 1] = true;

                if (tablero[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cMina = (CeldaMinas) tablero[i][j];
                    cMina.setNumero(aleatorio);
                    cMina.setEstado(1);
                }
            }
        }
    }

    /**
     * @Description Muestra en el gráfico del tablero la cabecera y el pie del tablero
     *
     * @param i Recibe un valor de tipo entero
     */
    public void cabeceraFinal(int i) {
        int c;
        c = 0;
        if (i == 0 || (i == (numFilas - 1))) {
            while (c < (numColumnas)) {
                System.out.print("|----");
                c++;
            }
            System.out.println("|");
        }
    }

    /**
     * Redefine el metodo mostrar de la clase Tablero. Muestra el tablero con las
     * celdas ocupadas por numeros generados en el metodo repartir. SI el estado es
     * a 2 a�ade un punto a la derecha, para distinguir los cantados con los no
     * cantados.
     *
     */
    public void mostrar() {
        for (int i = 0; i < (numFilas); i++) {
            cabeceraFinal(i);
            for (int j = 0; j < (numColumnas); j++) {
                if (tablero[i][j].getClass().equals(CeldaMinas.class)) {
                    CeldaMinas cMina = (CeldaMinas) tablero[i][j];

                    if (cMina.getEstado() == 2) {
                        if (cMina.getNumero() > 0 && cMina.getNumero() <= 9) {
                            System.out.print("| " + cMina.getNumero() + ". ");
                        } else {
                            System.out.print("| " + cMina.getNumero() + ".");
                        }
                    } else {
                        if (cMina.getNumero() > 0 && cMina.getNumero() <= 9) {
                            System.out.print("| " + cMina.getNumero() + "  ");
                        } else {
                            System.out.print("| " + cMina.getNumero() + " ");
                        }
                    }
                    if (j == (numColumnas - 1)) {
                        System.out.println("|");
                    }
                }
            }
            cabeceraFinal(i);
        }

    }


}
