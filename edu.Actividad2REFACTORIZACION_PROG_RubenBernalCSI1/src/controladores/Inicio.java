/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 301024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 301024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		
		//Titulo de la aplicación
		System.out.println("Bienvenido a la Calculadora");
		
		while (continuar) {
			//Muestro el menú por consola
			System.out.println("Menú");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			System.out.println("Seleccione una operación:");
			//Recojo la opción deseada por el usuario
			int opcion = scanner.nextInt();
			
			if (opcion == 5) {
				System.out.println("Saliendo...");
				continuar = false;
				continue;
			}
			
			//Pido al usuario los números con los que se va a operar
			System.out.print("Ingrese el primer número: ");
			double a = scanner.nextDouble();
			System.out.print("Ingrese el segundo número: ");
			double b = scanner.nextDouble();
			double resultado = 0;
			
			//Accedo a la opción deseada por el usuario
			switch (opcion) {
				case 1:
				   resultado = a + b;
				   System.out.println("Resultado: " + resultado);
				   break;
				case 2:
				   resultado = a - b;
				   System.out.println("Resultado: " + resultado);
				   break;
				case 3:
				   resultado = a * b;
				   System.out.println("Resultado: " + resultado);
				   break;
				case 4:
					if (b != 0) {
					resultado = a / b;
					System.out.println("Resultado: " + resultado);
					} else {
					System.out.println("Error: No se puede dividir entre cero.");
					}
					break;
				default:
					System.out.println("Opción no válida. Intente de nuevo.");
					break;
			}
		}
		
		scanner.close();
	}
}