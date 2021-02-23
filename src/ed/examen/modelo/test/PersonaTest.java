package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {

Persona p = new Persona("12345678W", "Adrián", "Mosquera");
	
	@Test
	void testPersonaStringStringString() {
		
		assertEquals("12345678W", p.getDni());
		assertEquals("Adrián", p.getNombre());
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
	
	@Test
	void testGetNombre() {
		
		//test valido
		assertEquals("Adrián", p.getNombre());
		
	}
	
	@Test
	void testSetNombre() {
		
		p.setNombre("pepe");
		assertEquals("pepe", p.getNombre());
		
	}
	
	@Test
	void testGetApellido1() {
		
		//test valido
		assertEquals("Mosquera", p.getApellido1());
		
	}
	
	@Test
	void testSetApellido1() {
		
		p.setApellido1("perez");
		assertEquals("perez", p.getApellido1());
		
	}
	
}
