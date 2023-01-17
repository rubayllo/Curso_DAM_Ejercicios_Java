import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * Realiza un programa que solicite números del 1al 5. 
 * No se almacenan los repetidos ni los que estén 
 * fuera de ese rango.El programa debe finalizar cuando 
 * se hayan introducido todos los números, mostrándolos 
 * en el orden que fueron tecleados. Utiliza un bucle 
 * while para leer un número e introducirlo con add en 
 * el conjunto, siempre que cumpla la condición de estar 
 * en el rango. La condición del bucle será que el 
 * tamaño del conjunto (size) sea inferior a 5. Para 
 * finalizar se deben mostrar todos los números del 
 * conjunto con un foreach.
 */

public class Numeros1al5 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lista = new LinkedHashSet<>(5);
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Introduzca números del 1-5 y pulse enter o dejee espacio entre cada numero:");

		do {
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				if (number <= 5 && number >= 1) {
					lista.add(number);
				}
			} else {
				sc.nextLine();
			}
		} while (lista.size() < 5);

		sc.close();

		System.out.print("Los números introducidos son: ");
		for (Integer i : lista) {
			System.out.print(i + " ");
		}
	}
}
