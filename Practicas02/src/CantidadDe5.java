
/*
 * Utilizando la instrucción while, 
 * realiza un programa que solicite un 
 * número entre 1 y 1.000.000 y muestre 
 * la cantidad de dígitos 5 que contiene
 */

import java.util.Scanner;

public class CantidadDe5 {

	public static void main(String[] args) {

		// Entrada
		Scanner sc = new Scanner(System.in);		
		System.out.print("Introduce un numero (1-1.000.000): ");
		int num = sc.nextInt();
		int contador = 0;

		// Proceso
		if ( num>=0 && num<=1000000) { //Comprueba que el numero este dentro del rango

			while (num > 0) {
				if (num%10 == 5) {
					contador++;
				}
				num/=10;
			}
			// Salida
			System.out.println("La cantidad de dígitos 5 que contiene es: " + contador);
		}
		else {
			System.out.println("Numero erroneo o fuera de rango");
		}

		sc.close();
	}

}
