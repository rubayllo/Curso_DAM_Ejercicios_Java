import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 19-12-2022 *
 ***************************************************/

/*
 * Según la RAE, el significado de tautología es algo repetitivo e innecesario.
 * Se propone un ejercicio que lea frases del estilo “palabra1 es palabra2” y
 * diga SI en caso de que ambas palabras sean iguales, sin tener en cuenta
 * mayúsculas o minúsculas, y NO en caso contrario.
 */

public class Tautologia {

	public static void main(String[] args) {

		// Entrada
		final String separador = " es ";
		String frase;
		String[] palabras;
		boolean verificar = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase con el siguiente formato ''X" + separador
				+ "X'' donde cada X sea una palabra a comparar:");
		do {
			frase = sc.nextLine();
			palabras = frase.toLowerCase().split(separador); // introduzco la separacion con espacios par impedir que
																// separe una
			// palabra que contenga la cadena "es" en su interior y transformo los
			// caracteres en minusculas lo primero para evitar fallos si introducen la
			// separacion en mayusculas " ES " y en la comparacion de cada parte lo unico es
			// que utilizaremos "equals" en vez de "equalsIgnoreCase"

			// Proceso de verificacion y salida por pantalla del resultado
			if (palabras.length == 2) { // verificacion de que se han introducido dos palabras una delante y otra
										// despues del delimitador " es "
				verificar = true; // Entrada correcta
				if (palabras[0].equals(palabras[1])) { // compara las palabras ignorando entre mayusculas o
														// minusculas
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
			} else {// Salida en caso de insertar mal los parametros exigidos
				System.out.println("\nLa frase que has introducido no corresponde a los parametros exigidos");
				System.out.println("Prueba otra vez");
			}
		} while (!verificar);
		sc.close();
	}
}
