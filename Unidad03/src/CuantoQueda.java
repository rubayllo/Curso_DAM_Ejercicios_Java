import java.util.Arrays;
import java.util.Scanner;

/***********************************************
 * Autor: Ruben Ayllon * Fecha:   19-11-2022   *
 ***********************************************/

/* Realiza un programa que lea 5 números (entre 1 y 50)
 *  que representan los kilómetros de cada etapa del 
 * Camino de Santiago. Los peregrinos van con un niño
 *  que siempre está preguntando “¿cuánto queda? 
 * El programa debe imprimir los kilómetros que quedan
 *  al comenzar cada una de las etapas. Utiliza el 
 *  envoltorio Arrays para imprimir los valores. 
 */

public class CuantoQueda {

	public static void main(String[] args) {

		// Entrada
		int[] kmEtapa; // km totales que recorreremos cada etapa
		int[] cuantoQueda; // km totales que nos quedan por cubrir al comienzo de cada etapa
		int km =0;
		int kmTotal = 0;

		kmEtapa = new int[5];
		cuantoQueda = new int[5];

		Scanner sc = new Scanner(System.in);

		// Proceso
		// En el siguiente bloque FOR
		// comenzamos a incluir los datos de cada km de las 5
		// etapas en el array kmEtapa de 5 posiciones

		for (int i = 0; i < kmEtapa.length; i++) {
			System.out.print("Etapa " + (i + 1) + ": "); // En este caso imprimo i+1 para
			if (sc.hasNextInt()) {
				km = sc.nextInt();
				if (km > 0 && km <= 50) { // gestionamos numeros fuera de rango
					kmEtapa[i] = km;
					kmTotal = kmTotal + km;
					sc = new Scanner(System.in); // ante la posibilidad de que el usuario registre un gran numero de
					// retornos de carro, numeros separados por espacios o tabulacione he decidido reiniciar el
					// objeto sc a su valor inicial
				} else {
					System.out.println("Los kilometros indicados estan fuera de rango.");
					System.out.println("Por favor inserte un valor entre 1 y 50.\n");
					i--; // En caso de error retorno la iteracion a su valor anterior
					sc = new Scanner(System.in); // ya explicado
				}
			} else {
				System.out.println("No ha ingresado un numero.\n");
				sc = new Scanner(System.in); // ya explicado
				i--; // al ingresar un valor no valido volvemos a retornar
				// la iteracion a su valor anterior
			}
		}
		sc.close();

		// En el siguiente bloque FOR comenzamos
		// a incluir los datos que quedan antes de empezar
		// cada etapa en el array cuantoQueda de 5 posiciones
		// restando los kilometros totales segun se va avanzando
		// de cada km total de cada Etapa

		for (int i = 0; i < cuantoQueda.length; i++) {
			cuantoQueda[i] = kmTotal;
			kmTotal = kmTotal - kmEtapa[i];
		}

		// Salida

		System.out.println(Arrays.toString(cuantoQueda));

	}

}
