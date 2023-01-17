import java.util.LinkedList;
import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 09-01-2023 *
 ***************************************************/

/*
 * Sea una baraja con las cartas que van del 1 al 10, 
 * se desea hacer un programa que simule eljuego del 
 * solitario. El objeto del juego es crear una pila de 
 * cartas en orden ascendente. En la entradase introducen 
 * 10 valores desordenados del 1 al 10, que simulan las 
 * cartas de una baraja en la queno hay palos. En cada 
 * jugada, se cogen simultáneamente dos cartas de ese 
 * mazo y se dan la vueltasobre la mesa, formando una 
 * pila de cartas visibles. De esa pila, sólo podrá 
 * retirarse en cadamomento la carta situada más arriba.
 * Cuando se retira la carta de la parte superior del mazo 
 * de cartas descubiertas, la que quedainmediatamente debajo 
 * pasa a quedar visible; si es posible colocarla, deberá 
 * ser colocada también;el proceso continuará hasta que no 
 * queden cartas visibles, o la superior no pueda ser colocada.
 * El jugador gana la partida si consigue colocar todas las cartas, 
 * y pierde en caso contrario, lo queocurre cuando da toda una 
 * vuelta a las cartas pendientes sin haber sido 
 * capaz de colocar ninguna.
 */


public class Solitario {

	public static void main(String[] args) {
		
		//Entrada de valores necesarios
		
		final int NUMEROCARTAS = 10; // Constante que puede variar con el tiempo sin afectar al resto del codigo
		final int SALTO = 2; // Constante que nos indica el numero de cartas que vas a sacar en cada jugada
		int carta;
		int cartasQuedan;
		boolean comprobar = false;
		LinkedList<Integer> baraja = new LinkedList<>(); // utilizo LinkedList dado que la voy a modificar y es mas rapido que ArrayList

		Scanner sc = new Scanner(System.in);

		System.out.printf("¿Como quedan barajadas las %d cartas? (Rango 1 - %d separadas por espacios o retornos de carro)\n", NUMEROCARTAS, NUMEROCARTAS);

		// Proceso de verificacion de datos
		do {
			if (sc.hasNextInt()) {
				carta = sc.nextInt();
				if (carta > 0 && carta <= NUMEROCARTAS && !baraja.contains(carta)) {
					baraja.add(carta);
				} else {
					System.out.println("Has introducido una secuencia erronea, numeros repetidos o fuera de rango!!!");
					System.out.printf(
							"\n¿Como quedan barajadas las %d cartas? (Rango 1 - %d separadas por espacios o retornos de carro)\n",
							NUMEROCARTAS, NUMEROCARTAS);
					baraja.clear();
					sc.nextLine();
				}
			} else {
				System.out.printf("Debes introducir numeros enteros del 0 - %d!!!\n", NUMEROCARTAS);
				System.out.printf(
						"¿Como quedan barajadas las %d cartas? (Rango 1 - %d separadas por espacios o retornos de carro)\n",
						NUMEROCARTAS, NUMEROCARTAS);
				sc.nextLine();
			}
		} while (baraja.size() < NUMEROCARTAS);
		sc.close();

		carta = 1; // aprovecho la variable carta y la inicio a 1 para hacer las comprobaciones segun salgan las cartas

		// Proceso verificacion del programa solitario
		while (!comprobar) {
			cartasQuedan = baraja.size(); // nos sirve para comprobar si la longitud de la lista va a cambiar o no
			for (int i = SALTO-1; i < baraja.size(); i += SALTO) { // Empieza desde la posicion 1 del bucle que es la segunda posicion del LinkedList y se incrementara segun el SALTO indicado
				while (i >= 0 && baraja.get(i) == carta) { // mientras que la condicion este dentro de los rangos y para evitar i=-1
					baraja.remove(i--); //elimino esa carta de la baraja y disminuyo en 1 la posicion "i" del bucle
					carta++; // Sumo uno para comprobar la carta siguiente que complete el solitario
				}
			}
			if (baraja.isEmpty() || cartasQuedan == baraja.size()) { // si la Lista esta vacia o la lista no ha cambiado
																		// despues del ultimo bucle
				comprobar = true; // Devuelve true para salir del bucle
			}
		}

		// Salida por pantalla del resultado
		System.out.println(baraja.isEmpty() ? "GANA" : "PIERDE");

	}
}
