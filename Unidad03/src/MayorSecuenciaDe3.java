import java.util.Scanner;

/***********************************************
 * Autor: Ruben Ayllon * Fecha:   19-11-2022   *
 ***********************************************/

/*
 * Realiza un programa que lea 9 números enteros y muestre por pantalla la mayor
 * secuencia de 3 números consecutivos que hay.
 */

public class MayorSecuenciaDe3 {

	public static void main(String[] args) {
		// Entrada

		int[] numeros;
		numeros = new int[9];
		int suma1 = 0;
		int suma2 = Integer.MIN_VALUE;
		int posicion = 0;

		Scanner sc = new Scanner(System.in);

		// Primero ingresamos todos los numeros dentro del array numeros

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			if (sc.hasNextInt()) {
				int valor = sc.nextInt();;
				numeros[i] = valor;
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

		/*
		 * Ahora comenzamos con las comparaciones de los sumatorios de cada secuencia de
		 * tres numeros recordando que el primer bloque FOR va a iterar toda la cadena
		 * de elementos menos los 2 ultimos para no pasarse de rango y que el segundo
		 * bloque for realizara las comparaciones de las sumas de cada 3 numeros
		 * secuenciales del array
		 */

		for (int i = 0; i < (numeros.length) - 2; i++) {
			for (int j = 0; j <= 2; j++) {
				suma1 = suma1 + numeros[i + j]; // de esta manera sacamos los arrays
												// siguientes a la posicion i y la suma total
			}
			if (suma1 > suma2) { // Asi guardo la posicion del primer array que me da la // mayor secuencia								
				posicion = i;
				suma2 = suma1;
			}
			suma1 = 0; // Reinicio el valor de la variable a comparar

		}

		// Salida
		/*
		 * Desde la posicion que da la mayor secuencia almacenada sacamos los numeros
		 * que componen la secuencia
		 */
		System.out.println(numeros[posicion] + " " + numeros[posicion + 1] + " " + numeros[posicion + 2]);

	}

}
