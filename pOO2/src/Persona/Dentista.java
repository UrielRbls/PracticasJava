package Persona;

public class Dentista extends Persona {
	
	//1 Atributos
	
	/*
	 * Ya no creo valores como nombre, edad, apellido, etc., porque estos valores los voy a heredar de la clase Persona
	 */
	
	String especialidad;
	String cedula;
	String consultoriaAsignado;
	String experiencia;
	String turno;
	int salario;
	
	//2 Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultoriaAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); //informacion de la clase //
		//informacion de la clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultoriaAsignado = consultoriaAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}//constructor Dentista con informacion heredada
	
	
	
	
	}
	
	
	
	
	
	
	


