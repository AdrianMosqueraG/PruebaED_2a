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
	
	@Test
	void testSetDni() {
		
		//test valido
		try {
			p.setDni("12345678W");
		} catch (Exception e) {
		//	e.printStackTrace();
		}
		
		assertEquals("12345678W", p.getDni());
		
		//test invalido
		boolean b = false;
		
		try {
			p.setDni("123456789012");
		} catch (Exception e) {
		//	e.printStackTrace();
			b = true;
		}
		
		assertTrue(b);
		
	}
	
}
