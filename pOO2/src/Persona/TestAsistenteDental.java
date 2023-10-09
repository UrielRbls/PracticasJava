package Persona;

public class TestAsistenteDental {
	
	public static void main(String[] args) {
		
		//Instancia de nuestro asistente
		
		AsistenteDental Francisca = new AsistenteDental ("05/10/2023", 875.40d);
		
		//Impresion de la informacion de nuestro asistente
		Francisca.mostrarDatosAsistente ();
		
		//El sueldo de Francisca no es de 875.4 es de 87.54
		//cambio de sueldo
		Francisca.salario=87.54d;
		
		//Mostrar solo el sueldo
		System.out.println(Francisca.salario);
		
		//Mostrar el sueldo (despues del getter)
		System.out.println(Francisca.getSalario());
		
	}//metodomain

}
