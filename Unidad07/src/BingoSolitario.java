import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 16-01-2023 *
 ***************************************************/

/*
 * Rodrigo es un niño que acaba de descubrir el juego 
 * del Bingo de sus hermanos mayores. Como ellos no están 
 * en clase, decide jugar él solo. Para ello, coge un boleto 
 * que tiene una serie de números y luego comienza a sacar 
 * bolas del bombo hasta que consigue marcar todos los números 
 * de su boleto, y aunque no le oiga nadie, canta “BINGO” 
 * Realiza un programa que lea el boleto del bingo y luego 
 * comience a leer números hasta que cante bingo. Tanto el 
 * boleto como los números del bombo se introducen por teclado.
 */

public class BingoSolitario {

	public static void main(String[] args) {

		final int BOLETO = 5; // Maximo numeros que contiene el boleto
		final int numMax = 99; // Maxima cantidad de numeros que para no hacer muy extenso el programa
		final int numMin = 1; // El menor numero que puede haber en el bombo
		
		int number;

		HashSet<Integer> boleto = new HashSet<>(BOLETO);
		LinkedHashSet<Integer> numBombo = new LinkedHashSet<>();
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Introduzca los %d números que contiene el BOLETO entre %d - %d pulse enter o dejee espacio entre cada numero: \n", BOLETO, numMin, numMax );

		// Introducimos los numeros del boleto
		do {
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				if (number <= numMax && number >= numMin && !boleto.contains(number) ) {
					boleto.add(number);
				} else {
					System.out.println("Hay algun numero invalido o repetido: ");
					sc.nextLine();
				}
			} else {
				System.out.println("Hay algun numero invalido o repetido: ");
				sc.nextLine();
			}
		} while (boleto.size() < BOLETO);
		System.out.println("Sus numeros son: " + boleto + "\n");

		System.out.printf("Introduzca los NUMEROS que salen del bombo alternativos del %d al %d: \n",numMin, numMax );
		// Ahora vamos al sorteo
		do {
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				if (number <= numMax && number >= numMin && !numBombo.contains(number) ) {
					numBombo.add(number);
				} else {
					System.out.println("Introduce un numero valido o no repetido: ");
					sc.nextLine();
				}
				boleto.remove(number);
			} else {
				sc.nextLine();
			}
		} while (boleto.size() != 0);

		sc.close();

		System.out.print("BINGO!!!");

	}
}
