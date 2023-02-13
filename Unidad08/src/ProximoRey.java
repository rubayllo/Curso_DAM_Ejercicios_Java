import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 30-01-2023 *
 ***************************************************/

/*
 * Jaimito está estudiando historia y acaba de idear una idea
 * para saber el número que le corresponde a un rey. Primero
 * va a leer todos los reyes de una dinastía en orden
 * cronológico, de talforma que, si cuando lee un nombre
 * ya ha reinado otro, le corresponde un número más que
 * el anterior. Después de leer toda la dinastía, debe leerse
 * otro nombre para saber el número que le toca.
 * 
 * ¿Serías capaz de hacer el mismo programa que Jaimito?
 */

public class ProximoRey {

	public static void main(String[] args) {

		String entradaDatos;
		boolean correcto = false; // Esta variable me va a servir para comprobar la entrada de datos

		List<String> dinastiaTotal = new ArrayList<String>();
		HashMap<String, Integer> dinastiaReal = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		// Entrada y verificacion de datos
		do {
			System.out.println("Introduce los nombres de todos los miembros de la familiar real:");
				// introduzco directamente los datos quitando espacios, comas, puntos y tabulaciones cambiando estos
				// ultimos por un espacion y ademas paso los caracteres a minusculas.
			entradaDatos = sc.nextLine().trim().replaceAll("[,.\s\t]+", " ").toLowerCase();
				// cojo solo datos que contengan caracteres
			if (entradaDatos.matches("[a-zA-Zá-úÁ-Ú\s]+")) {
				// Se meten todos los datos en el array dinastiaTotal posterior comparacion
				dinastiaTotal = Arrays.asList(entradaDatos.split(" "));

				// Ahora se pide el Rey del que quieres saber su proximo numero
				do {
					System.out.println("\n¿De cual rey quieres saber su proximo numero?:");
					// Se reutiliza el String entradaDatos y se inserta el dato eliminando espacios
					// delante y detras y remplazando las tabulaciones entre medias si las hay
					entradaDatos = sc.nextLine().trim().toLowerCase().replaceAll("[\t]", " ");
					if (entradaDatos.matches("[a-zA-Zá-úÁ-Ú\s]+")) {
						entradaDatos = entradaDatos.trim();
						// Verificacion de que ha introducido solo un nombre
						if (entradaDatos.contains(" ")) {
							System.out.println("Has introducido más de un nombre. Por favor introduce un solo nombre\n");
						} else {
							correcto = true; // comprobacion total hecha y salimos del bucle
						}
					} else {
						System.out.println("El dato introducido no es valido. Introduce un nombre válido que conetenga letras solamente\n");
					}
				} while (!correcto);

			} else {
				System.out.println("Los datos introducidos nos son válidos. Introduce nombres válidos que conetengan\nletras solamente y que estén separados por espacios, puntos y/o comas\n");
			}
		} while (!correcto);
		sc.close();
		
		// Proceso
		// Se crea un MAP y sumamos cuantos reyes hay de cada uno
		for (String mapeadoReyes : dinastiaTotal) {
			if (dinastiaReal.containsKey(mapeadoReyes)) {
				dinastiaReal.put(mapeadoReyes, dinastiaReal.get(mapeadoReyes) + 1);
			} else {
				dinastiaReal.put(mapeadoReyes, 1);
			}
		}
		
		// Salida
		System.out.print("\nEl proximo rey con ese nombre es el número: ");
		// Imprimo con un operador condicional ternario si existe el dato le sumo 1 y si no existe le digo que imprima 1
		System.out.println( dinastiaReal.containsKey(entradaDatos) ? (dinastiaReal.get(entradaDatos) + 1) : 1 );
	}
}
