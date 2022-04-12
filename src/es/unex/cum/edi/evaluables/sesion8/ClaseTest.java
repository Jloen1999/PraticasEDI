package es.unex.cum.edi.evaluables.sesion8;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The test class ClaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClaseTest
{
    private Clase c=null;

    public ClaseTest()
    {
    }

    @Test
    public void testAddEstudiante() {
        c= new Clase("1INF-TEL");
        assertTrue(c.addEstudiante(new Estudiante("Luis",10)));
        assertFalse(c.addEstudiante(new Estudiante("Luis",10))); //no se añade por estar duplicado
        assertTrue(c.addEstudiante(new Estudiante("Juan",12)));
        assertEquals(c.getListaClase().size(), 2);
    }

    @Test
    public void countSubjects() {
        c = new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        assertEquals(c.countSubjects(), 0);

        Estudiante aux=c.getEstudiante(10);
        c.addSubject(aux, new Asignatura("EE",10));
        c.addSubject(aux, new Asignatura("FE",6));
        c.addSubject(aux, new Asignatura("FC",7));
        c.addSubject(aux, new Asignatura("EDI",5));
        assertTrue(c.countSubjects() == 4);
        aux=c.getEstudiante(12);
        c.addSubject(aux, new Asignatura("EE",10));
        c.addSubject(aux, new Asignatura("FE",6));
        c.addSubject(aux, new Asignatura("FC",7));
        c.addSubject(aux, new Asignatura("EDI",5));
        assertTrue(c.countSubjects() == 8);
    }

    @Test
    public void testAddSubject()  {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        Estudiante aux=c.getEstudiante(10);
        assertFalse(c.addSubject(aux, new Asignatura("EDI",-5)));
        assertFalse(c.addSubject(aux, new Asignatura("EDI",10.01F)));
        assertTrue(c.addSubject(aux, new Asignatura("EDI",8)));
        assertFalse(c.addSubject(aux, new Asignatura("EDI",6)));
    }

    @Test
    public void testAddSubjectExp()  {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        Estudiante aux=c.getEstudiante(10);
        assertFalse(c.addSubjectExp(9, new Asignatura("EDI",8)));
        assertFalse(c.addSubjectExp(10, new Asignatura("EDI",-5)));
        assertFalse(c.addSubjectExp(10, new Asignatura("EDI",10.01F)));
        assertTrue(c.addSubjectExp(10, new Asignatura("EDI",8)));
        assertFalse(c.addSubjectExp(10, new Asignatura("EDI",6)));
    }

    @Test
    public void testCountPassSubjects() {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        c.addEstudiante(new Estudiante("Ana",13));
        c.addEstudiante(new Estudiante("Sara",14));
        assertTrue(c.countPassSubjects()==0);
        Estudiante aux=c.getEstudiante(10);
        c.addSubject(aux, new Asignatura("EDI",10));
        c.addSubject(aux, new Asignatura("EDI",4.99F));
        assertTrue(c.countPassSubjects()==1);
        aux=c.getEstudiante(13);
        c.addSubject(aux, new Asignatura("EDI",5.01F));
        assertTrue(c.countPassSubjects()==2);
        aux=c.getEstudiante(14);
        c.addSubject(aux, new Asignatura("EDI",7));
        assertTrue(c.countStudentsEDI()==3);

    }

    @Test
    public void testAverageMarks()  {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        Estudiante aux=c.getEstudiante(10);

        c.addSubject(aux, new Asignatura("EE",10));
        c.addSubject(aux, new Asignatura("FE",6));
        c.addSubject(aux, new Asignatura("FC",7));
        c.addSubject(aux, new Asignatura("EDI",5));
        assertEquals(c.averageMarks(10),7.0F,0.1F);
        assertEquals(c.averageMarks(12),0.0F,0.1F);
        assertEquals(c.averageMarks(13),-1.0F,0.1F);
    }

    @Test
    public void testCountStudentsEDI() {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        c.addEstudiante(new Estudiante("Ana",13));
        c.addEstudiante(new Estudiante("Sara",14));
        assertTrue(c.countStudentsEDI()==0);
        Estudiante aux=c.getEstudiante(10);
        c.addSubject(aux, new Asignatura("EDI",10));
        assertTrue(c.countStudentsEDI()==1);
        aux=c.getEstudiante(12);
        c.addSubject(aux, new Asignatura("Empresa",4.99F));
        aux=c.getEstudiante(13);
        c.addSubject(aux, new Asignatura("EDI",5.01F));
        assertTrue(c.countStudentsEDI()==2);
        aux=c.getEstudiante(14);
        c.addSubject(aux, new Asignatura("EDI",7));
        assertTrue(c.countStudentsEDI()==3);

    }

    @Test
    public void testCountPassedEDI() {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        c.addEstudiante(new Estudiante("Ana",13));
        c.addEstudiante(new Estudiante("Sara",14));
        assertTrue(c.countPassedEDI()==0);
        Estudiante aux=c.getEstudiante(10);
        c.addSubject(aux, new Asignatura("EDI",10));
        assertTrue(c.countPassedEDI()==1);
        aux=c.getEstudiante(12);
        c.addSubject(aux, new Asignatura("EDI",4.99F));
        assertTrue(c.countPassedEDI()==1);
        aux=c.getEstudiante(13);
        c.addSubject(aux, new Asignatura("EDI",5.01F));
        assertTrue(c.countPassedEDI()==2);
        aux=c.getEstudiante(14);
        c.addSubject(aux, new Asignatura("EDI",7));
        assertTrue(c.countPassedEDI()==3);

    }

    @Test
    public void lowestMark() {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        c.addEstudiante(new Estudiante("Ana",13));
        c.addEstudiante(new Estudiante("Sara",14));
        assertNull(c.lowestMark());
        Estudiante aux=c.getEstudiante(10);
        c.addSubject(aux, new Asignatura("EDI",10));
        aux=c.getEstudiante(12);
        c.addSubject(aux, new Asignatura("EDI",4.99F));
        assertEquals(c.lowestMark(),"Juan");
        aux=c.getEstudiante(13);
        c.addSubject(aux, new Asignatura("EDI",5.01F));
        assertEquals(c.lowestMark(),"Juan");
        aux=c.getEstudiante(14);
        c.addSubject(aux, new Asignatura("EDI",4.99F));
        assertEquals(c.lowestMark(),"Sara");
    }

    @Test
    public void testCountDistinctSubjects()  {
        c= new Clase("1INF-TEL");
        c.addEstudiante(new Estudiante("Luis",10));
        c.addEstudiante(new Estudiante("Juan",12));
        c.addEstudiante(new Estudiante("Ana",13));
        assertTrue(c.countDistinctSubjects()==0);
        Estudiante aux=c.getEstudiante(10);
        c.addSubject(aux, new Asignatura("EE",10));
        assertTrue(c.countDistinctSubjects()==1);
        c.addSubject(aux, new Asignatura("EDI",5));
        assertTrue(c.countDistinctSubjects()==2);
        aux=c.getEstudiante(12);
        c.addSubject(aux, new Asignatura("EE",10));
        c.addSubject(aux, new Asignatura("FE",6));
        c.addSubject(aux, new Asignatura("EDI",5));
        assertTrue(c.countDistinctSubjects()==3);
        aux=c.getEstudiante(13);
        c.addSubject(aux, new Asignatura("EE",10));
        c.addSubject(aux, new Asignatura("FE",6));
        c.addSubject(aux, new Asignatura("EDI",5));
        c.addSubject(aux, new Asignatura("FC",7));
        assertTrue(c.countDistinctSubjects()==4);
    }

}
