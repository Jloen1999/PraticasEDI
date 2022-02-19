/**
 * @Description:
 * Cada alumno deberá implementar una clase distinta que:
 *    • Tenga dos atributos String y un tipo entero (por este orden)
 *    • Tenga los constructores: por defecto y al menos un parametrizado
 *    • Tenga los accesores y mutadores
 *    • Tenga el método toString() y equals()
 * IMPORTANTE:
 * El primer valor que se lee por teclado, es el tamaño del array.
 * A continuación definir una clase main con un vector e implementar las operaciones de:
 *    1. Inicializar el vector
 *    2. Rellenar el vector. Primero se pedirá el tamaño del array y a continuación se pedirá  todos los objetos de la clase creada con datos (se pedirá por teclado por en el orden indicado).
 *    3. Listar todos los objetos del vector
 *    4. Obtener la media y el valor más alto del campo de tipo entero de todos los elementos de la lista.
 * El formato de salida, para una clase vehículo sería :
 *              [renault,megane,110]
 *              [ford,focus,135]
 *              [citroen,berlingo,85]
 *              .....
 *              Media: YYY Alto: XXXX
 * Donde YYY es la media  de los valores numéricos de los objetos del vector y XXX es el valor más alto.
 * @Author:  Jose Luis Obiang Ela Nanguan
 * @Version: 19/02/2022
 */

package evaluables.sesion2;
import java.util.Objects;

public class Libro {
    //Declaramos los atributos de la clase
    private String titulo;
    private String autor;
    private int isbn;

    //Constructor por defecto
    public Libro() {
        titulo = "";
        autor = "";
        isbn = 1;
    }

    //Constructor con un solo parametro
    public Libro(int is) {
        this.isbn = is;
    }
    //Constructor con todos los parametros

    public Libro(String tit,String at, int is) {
        this(is);
        this.titulo=tit;
        this.autor = at;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "[" +getTitulo()+','+getAutor()+','+getIsbn()+"]";
    }

           //Metodo equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

}
