import java.util.Arrays;
import java.util.Scanner;

/******************************************
 * Autor: Ruben Ayllon * Fecha: 5-12-2022 *
 ******************************************/

/*
 * Realiza un programa que sirva para saber si un sudoku está bien resuelto o
 * no. El tablero será una versión reducida de 3 x 3 en el que en cada casilla
 * debe haber un dígito entre 1 y 9 y tan solo se debe comprobar que no hay
 * dígitos repetidos. El programa escribirá “SI” en caso de estar bien hecho y
 * “NO” en caso contrario.
 */

public class Sudoku {

	public static void main(String[] args) {
		// Entrada

		final int FILA_SUDOKU = 3;
		final int COLUMNA_SUDOKU = 3;

		int[][] sudoku = new int[FILA_SUDOKU][COLUMNA_SUDOKU];
		int[] numerosIngresados = new int[(sudoku.length) * (sudoku[0].length)];// Array para introducir el numero total
																				// de datos de la matriz Sudoku

		int dato = 0;
		int sumatorio = 0;
		int aux = 0;

		boolean repetidos = false;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[0].length; j++) {
				System.out.print("Introduzca la coordenada (" + i + "," + j + "): ");

				if (sc.hasNextInt()) {
					sudoku[i][j] = sc.nextInt();
					if (sudoku[i][j] > 9 || sudoku[i][j] < 1) {
						System.out.println("\nError de datos introducidos");
						j--;
					}
					sc.nextLine();
				} else {
					System.out.println("\nError de datos introducidos");
					sc.nextLine();
					j--;
				}
			}
		}
		sc.close();

		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku.length; j++) {
				numerosIngresados[dato] = sudoku[i][j];
				dato++;
			}
		}

		Arrays.sort(numerosIngresados); // ordeno el array para simplificar la busqueda de un numero repetido de manera
										// que comparo los numero adyacentes del array

		do {
			aux = sumatorio + 1;
			if (numerosIngresados[sumatorio] == numerosIngresados[aux])// Compara la posicion de ese array con la
																		// adyacente
				repetidos = true;
			sumatorio++;
		} while (aux < numerosIngresados.length - 1);

		if (repetidos) {
			System.out.println("NO");
		} else {
			System.out.println("SI");
		}

	}

}
