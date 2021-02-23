package ed.examen.modelo;

/**
 * @author ADRIÁN MOSQUERA
 * @version 1.0.0
 * */
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Constructor de la clase a la que hay que meterlos parametros por defecto
	 * @param dni (dni del alumno)
	 * @param nombre (nombre del alumno)
	 * @param apellido1 (apellido del alumno)
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Devuelve el DNI de la persona
	 * @return DNI
	 */
	public String getDni() {
		return dni;
	}
	
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Te permite modificar el DNI de una instancia de la clase
	 * @param dni (de la persona a la que se lo quieres cambiar)
	 * @throws Exception (salta si no cumple la condicion de DNI)
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Devuelve el Nombre de la persona
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Te permite modificar el nombre de una instancia de la clase
	 * @param nombre (de la persona a la que se lo quieres cambiar)
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Devuelve el Apellido de la persona
	 * @return apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Te permite modificar el apellido de una instancia de la clase
	 * @param apellido (de la persona a la que se lo quieres cambiar)
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
