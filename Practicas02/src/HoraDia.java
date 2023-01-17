/*
 * Utilizando la instrucción if, 
 * se realiza un programa que pida una
 * hora por teclado y que muestre 
 * luego “Buenos dias”, “Buenas tardes” 
 * o “Buenas noches” según la hora
 */

import java.util.Scanner;

public class HoraDia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa una hora del dia (00 - 23): ");
		int hora = sc.nextInt();

		if ( hora >= 6 && hora <= 12 ) {
			System.out.println("Buenos dias");
		}
		else if ( hora >= 13 && hora <= 20 ) {
			System.out.println("Buenos tardes");			
		}
		else if ( (hora >= 21 || hora <= 23) && ( hora >= 0 && hora <= 5 ) ) {
			System.out.println("Buenos noches");			
		}
		else {
			System.out.println("Hora fuera de rango");						
		}

		sc.close();

	}

}
