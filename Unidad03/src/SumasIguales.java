import java.util.Scanner;

/***********************************************
 * Autor: Ruben Ayllon * Fecha:   19-11-2022   *
 ***********************************************/

/*
 * Dados 5 números enteros, María quiere saber si, sumando algunos de ellos en
 * orden, la suma es igual a la suma de los números que quedan por leer. Por
 * ejemplo 100 es igual a 25 + 25 + 25 + 15, por lo que dados los números 100 25
 * 25 25 25, la respuesta es SI. Sin embargo, si tenemos 1 2 3 4 5 la respuesta
 * sería NO.
 */

public class SumasIguales {

	public static void main(String[] args) {
		// Entrada

		int[] numeros;
		int suma1 = 0;
		int suma2 = 0;
		boolean comparaSumas = false;
		numeros = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Cantidad " + (i + 1) + ": ");
			if (sc.hasNextInt()) {
				int cantidad =  sc.nextInt();
				numeros[i] = cantidad;
				sc = new Scanner(System.in); // ante la posibilidad de que el usuario registre un gran numero de
				// retornos de carro, numeros separados por espacios o tabulacione he decidido reiniciar el
				// objeto sc a su valor inicial
			} else {
				System.out.println("No ha ingresado un numero.\n");
				sc = new Scanner(System.in); // ya explicado
				i--;
			}
		}
		sc.close();

		// Una vez tenemos toda la cadena completa del array numeros
		// comienzo con las operaciones

		for (int i = 0; i < (numeros.length) - 1; i++) {
			suma1 = suma1 + numeros[i];
			// El siguiente bucle sumara los numeros siguientes que queden del array
			for (int j = (i + 1); j < numeros.length; j++) {
				suma2 = suma2 + numeros[j];
			}
			if (suma1 == suma2) {
				comparaSumas = true;
			}
			suma2 = 0; // Reiniciamos suma2 para poder utilizarlo en la proxima comparacion
		}

		if (comparaSumas) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}
}
