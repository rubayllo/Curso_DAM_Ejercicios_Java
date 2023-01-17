import java.util.Scanner;

/******************************************
 * Autor: Ruben Ayllon * Fecha: 5-12-2022 *
 ******************************************/

/*
 * El juego Buscaminas comenzó a ser famoso cuando se incluyó en la versión 3.1
 * de Windows, en el lejano 1992. En este programa nuestro tablero tiene 5 filas
 * y 5 columnas, las bombas son “*” y las celdas vacías tienen “-“. Nuestra
 * labor es hacer un programa que solicite una coordenada (entre 0 y 4) para las
 * filas y otra para las columnas e indique el número de bombas que hay
 * alrededor. Se entiende que siempre se van a introducir valores válidos
 */

public class Buscaminas {

	public static void main(String[] args) {
		// Entrada

		final int FILAS_MATRIZ = 5;
		final int COLUMNAS_MATRIZ = 5;

		String[][] minas = new String[FILAS_MATRIZ][COLUMNAS_MATRIZ];
		String dato;
		String cordenadaDato;
		String cordenadaMatriz;

		int fila = -1;
		int columna = -1;
		int bombas = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("(*) para mina o (-) para zona sin mina\n");
		// Recogida de datos siempre que sean iguales a "*" o "-"
		for (int i = 0; i < minas.length; i++) {
			for (int j = 0; j < minas[0].length; j++) {

				System.out.print("Introduzca coordenada (" + i + "," + j + "): ");
				dato = sc.next();

				if (dato.equals("-") || dato.equals("*")) {
					minas[i][j] = dato;
				} else {
					System.out.println("Dato incorrecto. Vuelve a intentar\n\n(*) para mina o (-) para zona sin mina");
					j--;
				}
			}
		}

		do {
			System.out.printf("\nIntroduzca la FILA a comprobar (0 a %d): ", (FILAS_MATRIZ - 1));
			if (sc.hasNextInt()) { // comprobamos que se introduce un numero entero
				fila = sc.nextInt();
			} else {
				sc.nextLine();
			}
			if (fila < 0 || fila > (FILAS_MATRIZ - 1)) {
				System.out.println("No existe esa fila. Vuelve a intentar.");
			}
		} while (fila < 0 || fila > (FILAS_MATRIZ - 1)); // comprobamos con este bucle que el valor esta
		// dentro de los rangos necesarios

		do {
			System.out.printf("\nIntroduzca la COLUMNA a comprobar (0 a %d): ", (COLUMNAS_MATRIZ - 1));
			if (sc.hasNextInt()) { // comprobamos que se introduce un numero entero
				columna = sc.nextInt();
			} else {
				sc.nextLine();
			}
			if (columna < 0 || columna > (COLUMNAS_MATRIZ - 1)) {
				System.out.println("No existe esa columna. Vuelve a intentar.");
			}
		} while (columna < 0 || columna > (COLUMNAS_MATRIZ - 1)); // comprobamos con este bucle que el valor esta
		// dentro de los rangos necesarios

		sc.close();

		/*
		 * La proxima variable la he creado para poder comparar la posicion exacta de la
		 * matriz por medio de una cadena de caracteres, pudiendo ser sus valores 00,
		 * 01, 02, 03, 04, 11, 12,......,44 representando el primer numero la fila y el
		 * segundo numero la columna
		 */
		cordenadaDato = (fila + "" + columna);

		// Comenzamos a recorrer la matriz
		for (int i = 0; i < minas.length; i++) {
			for (int j = 0; j < minas[0].length; j++) {
				/*
				 * cordenadaMatriz variable creada para comparar con filaColumna de modo que si
				 * hay una mina en la coordenada ingresada esta no sea contada por el programa
				 * (tal y como sale en el ejemplo) cuando lleguemos a la condicion if
				 */
				cordenadaMatriz = (i + "" + j);
				dato = minas[i][j]; // recogemos el valor del dato que contiene esa posicion del array

				/*
				 * Recoger los valores adyacentes a la cordenada introducida que sean diferentes
				 * a la coordenada ingresada para que esa bomba no la cuente en caso de existir
				 * tal como se especifica en el ejemplo
				 */
				if (dato.equals("*") && (i == fila - 1 || i == fila || i == fila + 1)
						&& (j == columna - 1 || j == columna || j == columna + 1)
						&& (!cordenadaMatriz.equals(cordenadaDato))) {
					bombas = bombas + 1;
				}
			}
		}

		System.out.println(bombas);

	}
}
