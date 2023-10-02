package loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args){		/*
		 * public static void main(String[] args){
		 * While. El ciclo While ejecuta continuamente un bloque de codigo hsata que cumpla una cond
		 * while (expresion){
		 * 	//bloque de codigo a ejecutar
		 * 	(contador - iterador)
		 */
		
//		int cuenta = 1;
//		while (cuenta < 11) {
//			System.out.println("La cuenta es de: " + cuenta);
//			cuenta++;
//		}
		
		int cuenta = 0;
		while (cuenta < 10) {
			cuenta++;
			System.out.println("La cuenta es de : " + cuenta);
		}
		
		/*  Crea un programa que solicite al usuario un numero. Dicho numero sera tomado como el numero fina l de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el numero proporcionado.
		  1. importar un scanner e implementarlo.
		  2. Un mensaje para darle contexto al usuario.
		  3. Un mensjae para darle contexto al usuario.
		  4. Guardar en variable el numero que inicia la cuenta (1)
		  5. Implementar un ciclo while .
		  6. Mostrar por consola el resultado.
		 */
		
		//1.
		Scanner scanner = new Scanner(System.in);
		//2.
		System.out.println("Escribe un numero que servira como numero final de una cuenta");
		//3.
		int numFinal = scanner.nextInt();
		//4.
		int numInicial = 1;
		//5
		while (numInicial <= numFinal) {
			System.out.println(numInicial);
			numInicial++;
		}
		scanner.close();
	}
}
	
	
	
	
