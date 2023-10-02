package loops;

public class BreakContinue {
	public static void main(String[] args) {
		/*
		 * Sentencias utlilizadas en loops:
		 * -- break. Se utiliza para salir de un blucle en un punto especifico
		 * -- continue. Interrumpe la iteracion de un bucle, si se produce una condicion especifica y continua con la siguiente
		 */
		
		//Super ozzito va a realizar una rifa en la cual el cliente numero 5 se ganara una coca-cola de bolsita
		//Con break finalizando el bucle antes de llegar a la condicion
		for (int cliente = 1; cliente <= 20; cliente++) {
			if(cliente == 5) {
				System.out.println("Cliente numero  " + cliente + " GANASTE!");
				break;
			}System.out.println("Eres el cliente numero " + cliente);
		}
		for (int cliente = 1; cliente <= 20; cliente++) {
			if(cliente == 5) {
				System.out.println("Cliente numero  " + cliente + " GANASTE!");
				continue;
			}System.out.println("Eres el cliente numero " + cliente);
		}
	}

}
