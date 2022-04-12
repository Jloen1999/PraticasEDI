package es.unex.cum.edi.evaluables.sesion8;

import java.util.*;

public class Clase {
    protected String nombre;
    protected List<Estudiante> listaClase;
    private List l;

    //TODO: cambiar por ArrayList
    public Clase() {
        nombre = new String();
        listaClase = new ArrayList<Estudiante>();
    }

    public Clase(String nombre) {
        this.nombre = nombre;
        //TODO: Cambiar por new ArrayList();
        this.listaClase = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaClase() {
        return listaClase;
    }

    public void setListaClase(List<Estudiante> listaClase) {
        this.listaClase = listaClase;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listaClase == null) ? 0 : listaClase.hashCode());
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
        Clase other = (Clase) obj;
        if (listaClase == null) {
            if (other.listaClase != null)
                return false;
        } else if (!listaClase.equals(other.listaClase))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    //Añade sin comprobar que el estudiante ya existe
    public boolean addEstu(Estudiante e) {
        //TODO: cambiar por listaClase.add(e);
        return listaClase.add(e);
    }

    //TODO
    //Util para varios ejercicios. No puntua
    public Estudiante getEstudiante(int exp) {
        return listaClase.get(getIndexEstudiant(exp));
    }

    //Ejemplo que no puntua
    //Contar cuantos estudiantes con nombre Pepe hay

    //Ejemplo que no puntua
    //Contar cuantas asignaturas tienen una nota par    


    /**
     * Cuenta el numero de asignaturas que hay entre todos los estudiantes de la clase
     * Dificultad: Baja
     */
    public int countSubjects() {
        int totalAsignaturas = 0;

        for (int i = 0; i < listaClase.size(); i++) {
            Estudiante es = (Estudiante) listaClase.get(i);
            totalAsignaturas += es.getLista().size();
        }
        return totalAsignaturas;
    }

    /**
     * Añade un nuevo estudiante (no repetido - debe controlarse) en la lista.
     * Devuelve true si se ha podido añadir y false en caso contrario
     * Dificultad: Baja
     */
    public boolean addEstudiante(Estudiante e) {
        boolean existe = false;
        boolean insertado = false;

        int i = 0;
        while (i < listaClase.size() && !existe) {
            Estudiante es = (Estudiante) listaClase.get(i);
            if (es.getExp() == e.getExp()) {
                existe = true;
            }
            i++;
        }

        if (!existe) {
            insertado = addEstu(e);
        }
        return insertado;

    }

    public int getIndexEstudiant(int exp) {
        int i = 0, index = -1;

        while (i < listaClase.size() && index == -1) {
            Estudiante es = (Estudiante) listaClase.get(i);
            if (es.getExp() == exp) {
                index = i;
            }
            i++;
        }
        return index;
    }


    /**
     * Añade una asignatura al idEstudiante recibido por parametro. Tambien recibe la asignatura
     * Si todo va bien (no existe la asignatura), devuelve verdadero y falso en caso contrario
     * Si la nota recibida no esta entre 0 y 10 se retorna false
     *
     * @param exp
     * @param newSubject Dificultad: Media
     */
    public boolean addSubjectExp(int exp, Asignatura newSubject) {
        boolean insertado = false;
        boolean existAsig = false;

        if (newSubject.getNota() >= 0 && newSubject.getNota() <= 10) {

            int index = getIndexEstudiant(exp);
            if (index != -1) {

                Lista asignaturas = listaClase.get(index).getLista();
                if (!asignaturas.listaVacia()) {

                    asignaturas.iterator();
                    while (asignaturas.hasNext() && !existAsig) {
                        Asignatura asig = (Asignatura) asignaturas.next();
                        if (asig.getNombre().equals(newSubject.getNombre())) {
                            existAsig = true;
                        }
                    }
                }

                if (!existAsig) {
                    listaClase.get(index).addAsignatura(newSubject);
                    insertado = true;
                }
            }
        }
        return insertado;
    }

    /**
     * Añade una asignatura al estudiante recibido por parametro. Tambien recibe la asignatura
     * Si todo va bien (no existe la asignatura), devuelve verdadero y falso en caso contrario
     * Si la nota recibida no esta entre 0 y 10 se retorna false
     *
     * @param currentStudent
     * @param newSubject     Dificultad: Baja
     */
    public boolean addSubject(Estudiante currentStudent, Asignatura newSubject) {
        boolean insertado = false;
        boolean existAsig = false;

        if (newSubject.getNota() >= 0 && newSubject.getNota() <= 10) {

            int index = listaClase.indexOf(currentStudent);
            if (index != -1) {

                Lista asignaturas = listaClase.get(index).getLista();
                if (!asignaturas.listaVacia()) {

                    asignaturas.iterator();
                    while (asignaturas.hasNext() && !existAsig) {
                        Asignatura asig = (Asignatura) asignaturas.next();
                        if (asig.getNombre().equals(newSubject.getNombre())) {
                            existAsig = true;
                        }
                    }
                }

                if (!existAsig) {
                    listaClase.get(index).addAsignatura(newSubject);
                    insertado = true;
                }
            }
        }
        return insertado;
    }


    /**
     * Cuenta el numero de asignaturas aprobadas entre todos los estudiantes de la clase
     * Dificultad: Media
     */
    public int countPassSubjects() {
        int totalAsigApro = 0;
        for (int i = 0; i < listaClase.size(); i++) {
            Lista asignaturas = listaClase.get(i).getLista();
            asignaturas.iterator();
            while (asignaturas.hasNext()) {
                Asignatura asig = (Asignatura) asignaturas.next();
                if (asig.getNota() >= 5) {
                    totalAsigApro++;
                }
            }
        }
        return totalAsigApro;
    }

    /**
     * Calcula la media de notas del estudiante recibido. Si el estudiante no existe
     * devuelve -1.0F
     *
     * @param exp
     * @return la nota media del estudiante
     * Dificultad: Media
     */
    public float averageMarks(int exp) {

        float media = 0.0f, totalNotas = 0.0f;
        int index = getIndexEstudiant(exp);
        if (index != -1) {
            Lista asignaturas = listaClase.get(index).getLista();
            if(!asignaturas.listaVacia()) {

                asignaturas.iterator();
                while (asignaturas.hasNext()) {
                    Asignatura asig = (Asignatura) asignaturas.next();
                    totalNotas += asig.getNota();
                }
                media = totalNotas / asignaturas.size();
            }
        } else {
            media = -1.0F;
        }
        return media;
    }

    /**
     * Devuelve el numero de estudiantes que estan matriculados en EDI.
     * Dificultad: Media
     */
    public int countStudentsEDI() {
        int totalEstuEDI = 0;
        for (int i = 0; i < listaClase.size(); i++) {
            Lista asignaturas = listaClase.get(i).getLista();
            asignaturas.iterator();
            while (asignaturas.hasNext()) {
                Asignatura asig = (Asignatura) asignaturas.next();
                if (asig.getNombre().equals("EDI")) {
                    totalEstuEDI++;
                }
            }
        }
        return totalEstuEDI;
    }

    /**
     * Devuelve el numero de estudiantes que han aprobado EDI.
     * Si no hay estudiantes que hayan aprobado EDI, se devuelve 0
     * Dificultad: Media
     */
    public int countPassedEDI() {
        int totalEstuAprobEDI = 0;
        for (int i = 0; i < listaClase.size(); i++) {
            Lista asignaturas = listaClase.get(i).getLista();
            asignaturas.iterator();
            while (asignaturas.hasNext()) {
                Asignatura asig = (Asignatura) asignaturas.next();
                if (asig.getNombre().equals("EDI") && asig.getNota() >= 5) {
                    totalEstuAprobEDI++;
                }
            }
        }
        return totalEstuAprobEDI;
    }

    /**
     * Devuelve el nombre del estudiante con la nota mas baja en EDI.
     * Si no hay estudiantes que hayan aprobado EDI, se devuelve null.
     * Si hay mas de un estudiante con la misma nota mas baja, se devuelve el ultimo de ellos
     * Dificultad: Elevada
     */
    public String lowestMark() {

        float menor = Float.MAX_VALUE; // Valor maximo de una variable decimal
        String nombre = null;
        for (int i = 0; i < listaClase.size(); i++) {
            Lista asignaturas = listaClase.get(i).getLista();
            asignaturas.iterator();
            while (asignaturas.hasNext()) {
                Asignatura asig = (Asignatura) asignaturas.next();
                if (asig.getNota() <= menor) {
                    menor = asig.getNota();
                    nombre = listaClase.get(i).getNombre();
                }
            }
        }
        return nombre;
    }


    /**
     * Cuenta cuantas asignaturas distintas hay
     * Dificultad: Elevada
     */
    public int countDistinctSubjects() {

        List<String> nombresAsign = new ArrayList<String>();
        for (int i = 0; i < listaClase.size(); i++) {

            Lista asignaturas1 = listaClase.get(i).getLista();
            asignaturas1.iterator();
            while(asignaturas1.hasNext()) {

                Asignatura a = (Asignatura) asignaturas1.next();
                if(i == 0) {
                    nombresAsign.add(a.getNombre());
                } else {

                    int index = nombresAsign.indexOf(a.getNombre());
                    if(index == -1) {
                        nombresAsign.add(a.getNombre());
                    }
                }
            }
        }
        return nombresAsign.size();
    }

}
