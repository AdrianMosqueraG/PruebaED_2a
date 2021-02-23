package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ADRIÁN MOSQUERA
 * @version 1.0.0
 * */
public class Curso {
	
	private List<Persona> listaAlumnos;

	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Metodo eliminar alumno el cual si se cumple la condición elimina un alumno
	 * @param dni (DNI del alumno que queremos eliminar)
	 * @throws Exception (salta si no cumple la condicion del DNI)
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Metodo que aniade a un alumno
	 * @param p (p = una instancia creada previamente de persona)
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Metodo que comprueba si esta un alumno esta registrado
	 * @param dni (DNI del alumno que queremos eliminar)
	 * @return True (si el alumno esta registrado) / False (si el alumno no esta registrado)
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Constructor de la clase la cual no hace falta meterle valores por defecto
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Metodo que muestra la lista de los alumnos ya existentes
	 * @return Numero de alumnos registrados
	 */
	public Integer numeroAlumnos() {
		
		return listaAlumnos.size();
		
	}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
