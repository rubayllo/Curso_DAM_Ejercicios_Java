import java.util.Arrays;
import java.util.Scanner;

/***********************************************
 * Autor: Ruben Ayllon * Fecha:   19-11-2022   *
 ***********************************************/

/*
 * Realiza un programa que pida 6 números enteros (menores que 100) e imprima
 * “SI” cuando se han introducido números repetidos y “NO” en caso contrario.
 */

public class HayRepetidos {

	public static void main(String[] args) {
		// Entrada

		int[] numeros;
		boolean repetidos = false;
		numeros = new int[6];

		Scanner sc = new Scanner(System.in);

		// Primero ingresamos todos los numeros dentro del array numero
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			if (sc.hasNextInt()) {
				int valor =  sc.nextInt();
				if (valor <= 100) {
					numeros[i] = valor;
					sc = new Scanner(System.in); // ante la posibilidad de que el usuario registre un gran numero de
					// retornos de carro, numeros separados por espacios o tabulacione he decidido reiniciar el
					// objeto sc a su valor inicial
				} else { // gestionamos numeros fuera de rango
					System.out.println("Por favor inserte un valor menor o igual a 100.\n");
					i--; // En caso de error retorno la iteracion a su valor anterior
					sc = new Scanner(System.in); // ya explicado
				}
			} else {
				System.out.println("No ha ingresado un numero.\n");
				sc = new Scanner(System.in); // ya explicado
				i--;
			}
		}
		sc.close();

		// Ahora comprobamos y comparamos valores, primero ordenamos el array de menor a mayor
		// y comprobamos la igualdad del numero de array "i" con el numero siguiente
		// al estar ordenados, si el siguiente es el mismo numero, repetidos nos devolvera un "true"

		Arrays.sort(numeros);

		for (int i = 0; i < numeros.length - 1; i++) {
			if (i < (numeros.length - 1) && numeros[i] == numeros[i + 1]) {
				repetidos = true;
			}
		}

		// Salida

		if (repetidos) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
