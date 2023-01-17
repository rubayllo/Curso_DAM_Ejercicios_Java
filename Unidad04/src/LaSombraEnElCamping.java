import java.util.Arrays;
import java.util.Scanner;

/******************************************
 * Autor: Ruben Ayllon * Fecha: 5-12-2022 *
 ******************************************/

/*
 * La sobra que dan los árboles en un camping es clave para saber dónde dejar la
 * tienda de campaña. Sea un camping de 10x10, donde cada árbol da sombra en las
 * 8 parcelas que tiene a su alrededor (sin sobrepasar los límites del camping).
 * Realiza un programa que solicite las coordenadas de 4 árboles y nos diga la
 * cantidad de parcelas que tienen sombra. Las coordenadas van 0 a 9 y se
 * entiende que siempre se van a introducir valores válidos
 */

public class LaSombraEnElCamping {

	public static void main(String[] args) {
		// Entrada
		final int FILAS_PARCELA = 10;
		final int COLUMNAS_PARCELA = 10;
		final int NUMERO_ARBOLES = 4;

		int fila = 0;
		int columna = 0;
		int sombras = 0;
		int[][] parcelaArbol = new int[FILAS_PARCELA][COLUMNAS_PARCELA];
		int[][] parcelaSombra = new int[FILAS_PARCELA][COLUMNAS_PARCELA];
		boolean comprobarFila;
		boolean comprobarColumna;
		String[] cordenadasArbol = new String[4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= (NUMERO_ARBOLES - 1); i++) {
			System.out.print("Árbol " + (i + 1) + " fila (0-9): ");
			comprobarFila = sc.hasNextInt();
			if (comprobarFila) {
				fila = sc.nextInt();
				sc.nextLine();
			} else {
				sc.nextLine();
			}
			System.out.print("Árbol " + (i + 1) + " columna (0-9): ");
			comprobarColumna = sc.hasNextInt();
			if (comprobarColumna) {
				columna = sc.nextInt();
				sc.nextLine();
			} else {
				sc.nextLine();
			}

			if (!comprobarFila || !comprobarColumna || fila < 0 || columna < 0 || fila > 9 || columna > 9) {
				System.out.println("Datos incorrectos. Vuelva a intentarlo");
				i--;
			} else {
				cordenadasArbol[i] = fila + ":" + columna; // mediante string guardo la cordenada correcta
				parcelaArbol[fila][columna] = 1;
			}
			System.out.println(); // imprimo linea en blanco para mejor visualizacion
		}
		sc.close();

		/*
		 * Utilizando dos matrices de la misma longitud localizo la sombra que produce
		 * cada arbol dentro de la parcela y lo introduzco dentro del array
		 * parcelaSombra
		 */
		for (int i = 0; i < parcelaArbol.length; i++) {
			for (int j = 0; j < parcelaArbol[0].length; j++) {
				if (parcelaArbol[i][j] == 1) {
					parcelaSombra[i][j] = 1; // arbol
					if (i > 0 && j > 0) {
						parcelaSombra[i - 1][j - 1] = 1; // diagonal top izquierda arbol
					}
					if (j - 1 >= 0) {
						parcelaSombra[i][j - 1] = 1; // izquierda arbol
					}
					if (i + 1 <= 9 && j - 1 >= 0) {
						parcelaSombra[i + 1][j - 1] = 1; // diagonal down izquierda arbol
					}
					if (i + 1 <= 9) {
						parcelaSombra[i + 1][j] = 1; // top arbol
					}
					if (i - 1 >= 0) {
						parcelaSombra[i - 1][j] = 1; // down arbol
					}
					if (i - 1 >= 0 && j + 1 <= 9) {
						parcelaSombra[i - 1][j + 1] = 1; // diagonal top derecha arbol
					}
					if (j + 1 <= 9) {
						parcelaSombra[i][j + 1] = 1; // derecha arbol
					}
					if (i + 1 <= 9 && j + 1 <= 9) {
						parcelaSombra[i + 1][j + 1] = 1; // diagonal down derecha arbol
					}
				}
			}
		}

		/*
		 * Para que se vea mejor la ejecucion del programa muestro las cordenadas
		 * introducidas y la matriz de la parcela con su arboles y sombra interpretados
		 * por el numero 1
		 */
		System.out.println("Cordenadas introducidas:\n" + Arrays.toString(cordenadasArbol) + "\n");

		for (int i = 0; i < parcelaArbol.length; i++) {
			for (int j = 0; j < parcelaArbol[0].length; j++) {
				System.out.print(parcelaSombra[i][j] + " ");
				if (j == 9) {
					System.out.println();
				}
			}
		}

		/*
		 * Finalmente contamos la cantidad de numeros 1 que hay dentro de la matriz para
		 * saber cuantas zonas con sombra existen
		 */
		for (int i = 0; i < parcelaArbol.length; i++) {
			for (int j = 0; j < parcelaArbol[0].length; j++) {
				if (parcelaSombra[i][j] == 1) {
					sombras++;
				}
			}
		}
		System.out.println("\nLa sombra total es: " + sombras);
	}
}
