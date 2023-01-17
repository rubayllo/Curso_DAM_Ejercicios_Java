import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 19-12-2022 *
 ***************************************************/

/*
 * Realiza un programa que indique la cantidad de veces que está la palabra
 * “amor” en el texto. La palabra puede aparecer todo seguida o con otras letras
 * en su interior. Así, por ejemplo, “Era muy dorado” tiene amor una vez.
 */

public class TextoConAmor {

	public static void main(String[] args) {

		// entrada
		final String[] PALABRA = { "a", "m", "o", "r" };
		final int indiceArrayPalabras = PALABRA.length - 1; // Nos va a servir para saber cuando hemos encontrado una PALABRA

		String frase;
		int cuentaLetras = 0; // Nos va a servir para posicionarnos en la posicion de la letra del array
								// PALABRA que vamos a comparar
		int cuentaPalabras = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la frase a analizar:");
		frase = sc.nextLine();
		sc.close();

		// Proceso

		for (int i = 0; i < frase.length(); i++) {
			// Gracias al metodo substring() y el metodo equalsIgnoreCase() en el siguiente if paso
			// la posicion del caracter que hay en la posicion i y que termina en i+1 (para coger solo un caracter)
			// se compara con la constante PALABRA segun la posicion indicada en la variable cuentaLetras
			// cadenas ignorando mayusculas y minusculas
			if (frase.substring(i, i+1).equalsIgnoreCase(PALABRA[cuentaLetras])) {
				cuentaLetras++;
			}
			if (cuentaLetras == indiceArrayPalabras) { // cuando cuentaLetras ha llegado a ser igual a
														// indiceArrayPalabras quiere decir que ya hay una PALABRA
														// encontrada
				cuentaLetras = 0; // reiniciamos a 0 para volver a buscar una nueva PALABRA
				cuentaPalabras++; // sumamos una PALABRA encontrada
			}
		}

		System.out.println(cuentaPalabras);
	}
}