package flujoControl;

public class EstructurasDeControl {//Debe coincidir la clase con el nombre de nuestro documento
	
	public static void main(String[] args) {//Todo dentro del metodo main
		
	// Para que se ejecute, siempre debe de ir dentro del metodo principal
		
		//Primero definimos una variable de tipo string donde almaceno un dato
		
		String citaProgramada = null; //Dejamos en Null y despues lo cambiamos a una fecha "28-09-23"
		
		// La variable declarada, se inicia en null a proposito para tener un espaciao de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null)  {
			System.out.println("Ya hay una cita programada");
		};// Porque la variable ya esta ocupada o llena 
	else {
		System.out.println("Puede registrar su cita");// Podemos registrar otra cita
	// Seleccionamos una opcion y almacenando la variable opcion
		
	int opcion = 1;
	
	//Creamos un menu
	System.out.println("Menu del Diente Feliz Consultorio Dental");
	System.out.println("1. Desea Programar una cita?");
	System.out.println("2. Verificar Cita Programada");
	System.out.println("3. Cancelar Cita");
	System.out.println("4. Salir del Menu");
	System.out.println("Seleccione una opcion de Menu (1-4)");
	
	switch (opcion) {
	case 1:
		System.out.println("Usted ha seleccionado la opcion programar cita."); //Agrega la logica para programar una cita 
		break;
	case 2: System.out.println("Usted ha seleccionado la opcion verificaar cita");
	break;
	case 3: System.out.println("Usted ha seleccionado la opcion de cancelar cita");
	break;
	default:
		System.out.println("La opcion que usted selecciono no es valida. Por favor, seleccione una opcion de nuestro menu (1-4).");
		break;
	}
		
		
	}//metodo
}//clase
