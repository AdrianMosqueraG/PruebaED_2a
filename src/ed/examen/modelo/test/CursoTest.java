package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {
	
	Curso c = new Curso();
	Persona p = new Persona("12345678W", "Adrián", "Mosquera");
	
	@Test
	void testEliminarAlumno() {
		
		//test valido
		boolean b = false;
		
		try {
			c.eliminarAlumno("12345678W");
		} catch (Exception e) {
		//	e.printStackTrace();
			b = true;
		}
		
		assertFalse(b);
		
	}

	@Test
	void testAniadirAlumno() {
		
		//test valido
		int anAlum = c.numeroAlumnos();
		
		c.aniadirAlumno(p);
		
		int dnAlumn = c.numeroAlumnos();
		
		assertEquals(dnAlumn, c.numeroAlumnos());
		
	}
	
	@Test
	void testEstaRegistrado() {
		
		//test valido
		boolean b = true;
		
		c.aniadirAlumno(p);
		
		assertEquals(b, c.estaRegistrado("12345678W"));
		
	}
	
	@Test
	void testCurso() {
		
		Curso c1 = new Curso();
		assertNotNull(c1);
		
	}
	
}
