import java.util.Scanner;

/*
 * Realiza un programa que solicite la cantidad 
 * de números a introducir (más de uno) y luego 
 * los pida por teclado (los números serán enteros). 
 * El programa debe determinar si los números están 
 * en secuencia ascendente, descendente o no hay 
 * secuencia. Están en secuencia ascendente cuando 
 * cada número es superior al anterior. Están en 
 * secuencia descendente cuando cada número es inferior 
 * al anterior. No están en secuencia cuando no se 
 * cumple ninguna de las dos posibilidades anteriores.
 */

public class CalculaSecuencia {

	public static void main(String[] args) {

		// Entrada
		boolean ascendente = false;
		boolean descendente = false;
		int numSiguiente = 0;
		int numAnterior = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cantidad de numeros: ");
		int canNum = sc.nextInt();

		// Proceso
		for (int j = 1; j <= canNum; j++) {
			numAnterior = numSiguiente;
			numSiguiente = sc.nextInt();

			if (j >= 2) { // Las comparaciones solo se pueden dar cuando tenemos 2 o mas numeros ingresados
				if (numSiguiente > numAnterior) {
					ascendente = true;
					
				} else if (numSiguiente < numAnterior) {
					descendente = true;
					
				} else if (numSiguiente == numAnterior) { // En caso de que los numeros a comparar sean iguales
					ascendente = true;
					descendente = true;
				}
			}
		}
		// Salida
		/*
		 * Si siempre se ha dado la misma condicion "c>d" o en caso contrario "c<d"
		 * sabemos que uno de los dos booleanos sera True y otro sera False. En caso que
		 * ambos sean True no puede haber secuencia
		 */
		if (ascendente ^ descendente) {
			if (ascendente) {
				System.out.println("Secuencia ascendente");

			} else if (descendente) {
				System.out.println("Secuencia descendente");
			}

		} else {
			System.out.println("Sin secuencia");
		}

		sc.close();
	}

}