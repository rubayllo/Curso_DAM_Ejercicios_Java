
/* 
 * Utilizando la instrucción switch, 
 * escribe un programa en que dado un 
 * número del 1 a 7 escriba el correspondiente 
 * nombre del día de la semana. En caso de 
 * introducir un número fuera del rango, 
 * se informará al usuario de su error.
 */

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {

		// Entrada
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, introduzca un número del 1 al 7: ");
		int dia = sc.nextInt();

		// Proceso y Salida
		switch (dia) {
		case 1: {
			System.out.println("Lunes");
			break; // Sin su uso la instuccion se seguiria ejecutando
		}

		case 2: {
			System.out.println("Martes");
			break;
		}

		case 3: {
			System.out.println("Miercoles");
			break;
		}

		case 4: {
			System.out.println("Jueves");
			break;
		}

		case 5: {
			System.out.println("Viernes");
			break;
		}

		case 6: {
			System.out.println("Sabado");
			break;
		}

		case 7: {
			System.out.println("Domingo");
			break;
		}

		default:
			System.out.println("Numero fuera de rango");
		}

		sc.close();
	}

}
