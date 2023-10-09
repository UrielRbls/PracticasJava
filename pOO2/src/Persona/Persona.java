package Persona;

public class Persona {
	
//	public static void main(String[]args) {
//		
//	}
	// 1 Atributos
	
	String nombre;
	String apellido;
	byte edad; //para tener una correcta asignacion de memoria 
	String telefono;
	String email;
	
	// 2 Constructor
	Persona (String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}//cierre constructor	
	
	//3 Metodos (lo que podra hacer mi objeto)
	void imprimirInfo() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);
	}//cierre imprimirInfo
	
	void saludar( ) {
		System.out.println("Hola, te mando saluditos");
	}//cierre saludar
	
	
	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ ", email=" + email + "]";
	
	//Metodo principal
//	public static void Main(String[] args) {
//
//	
//		
//	}
	//4 Instancia

	
	}
}




















