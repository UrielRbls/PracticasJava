package flujoControl;
import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		/*
		 * Condicion para determinar si el paciente
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe tu edad:");
		int edad = scanner.nextInt();
		scanner.close();
		
		String mayorOMenor = null;
		
		mayorOMenor = (edad .+)
		
		if(edad >= 18) {
			System.out.println("Felicidades, ya no necesitas que tu mama te acompañe a hacer el tramite");
		}else {
			System.out.println("Dile a tu mama que venga");
		}
		
		boolean pago = true;
		
		String resultado = (pago) ? "Ya pago" : "No pago";
		System.out.println("El paciente " + resultado);
		
	}
}
