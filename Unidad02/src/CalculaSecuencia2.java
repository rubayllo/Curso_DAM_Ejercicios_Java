import java.util.Scanner;

public class CalculaSecuencia2 {

	public static void main(String[] args) {

		// Entrada
		boolean ascendente = false;
		boolean descendente = false;
		int numSiguiente = 0;
		int numAnterior = 0;
		numSiguiente = Integer.MIN_VALUE;
		numSiguiente = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cantidad de numeros: ");
		int canNum = sc.nextInt();

		// Proceso
		for (int j = 1; j <= canNum; j++) {
			numAnterior = numSiguiente;
			numSiguiente = sc.nextInt();


			if (numSiguiente > Integer.MIN_VALUE) {
				ascendente = true;

			} else if (numSiguiente < Integer.MAX_VALUE) {
				descendente = true;

			} else if (numSiguiente == numAnterior) { // En caso de que los numeros a comparar sean iguales
				ascendente = true;
				descendente = true;
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