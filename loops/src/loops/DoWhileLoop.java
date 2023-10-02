package loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * Do-while. Evalúa su expresión en la parte inferior del ciclo. Por lo tanto,
         * las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez
         */

        // Cuenta de 1 al 10
        int cuenta = 1;
        do {
            System.out.println(cuenta);
            cuenta++;
        } while (cuenta <= 10); // Corregido el error aquí: debe ser cuenta <= 10

        /*
         * Crear un programa para un cajero bancario - El programa mostrará 4
         * opciones: 1. Consultar saldo 2. Ingresar dinero 3. Retirar dinero 4. Salir
         * - Mostrar mensaje de bienvenida al usuario, dar contexto y solicitar que
         * elija una opción - El usuario puede salir del programa escribiendo 4 (salir)
         */
        System.out.println("Bienvenido al Banco Generatio, elige cualquiera de las opciones escribiendo el número correspondiente:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");

        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada = scanner.nextInt();

        switch (opcionSeleccionada) { //  "swtich" a "switch"
            case 1:
                System.out.println("Consultar saldo");
                break;
            case 2:
                System.out.println("Ingresar dinero");
                break;
            case 3:
                System.out.println("Retirar dinero"); //  "Ingresar dinero" a "Retirar dinero"
                break;
            case 4:
                System.out.println("Gracias por usar nuestros servicios. Hasta luego.");
                break; //  "Ingresar dinero" a "Gracias por usar nuestros servicios. Hasta luego."
            default:
                System.out.println("Elige una opción válida");
                break;
        }

        scanner.close(); // Cerramos el scanner al final del programa
    }
}
