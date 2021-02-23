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

}
