package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {

Persona p = new Persona("12345678W", "Adri�n", "Mosquera");
	
	@Test
	void testPersonaStringStringString() {
		
		assertEquals("12345678W", p.getDni());
		assertEquals("Adri�n", p.getNombre());
		assertEquals("Mosquera", p.getApellido1());
		
	}

	@Test
	void testGetDni() {
		
		//test valido
		assertEquals("12345678W", p.getDni());
		
	}
	
}
