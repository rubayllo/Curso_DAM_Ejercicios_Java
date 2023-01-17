import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 09-01-2023 *
 ***************************************************/

/*
 * El teclado de Ramiro se ha estropeado. Cuando pulsa la tecla del guion (-)
 * tiene el mismoresultado que si pulsa la tecla Inicio, y el cursor se le va al
 * principio de la línea. Algo parecido leocurre con el +, que se lleva el
 * cursor al final igual que la tecla Fin. Y al pulsar * se consigue el
 * mismoefecto que con la tecla de la flecha derecha. Pero lo peor de todo es lo
 * que ocurre con el 3: ¡hace lomismo que la tecla Supr, que borra la letra que
 * hay a la derecha del cursor!Realiza un programa que solicite un texto y
 * muestre en una línea el texto final que obtendrá Ramiro tras pulsar las teclas
 * indicadas en el orden dado.
 */

public class TecladoEscacharrado {

	public static void main(String[] args) {

		String entradaDatos;
		StringBuilder salidaDatos = new StringBuilder();
		char caracter;

		int cursor = 0; // Va a posicionar el cursor en la posicion indicada de salidaDatos en caso de
						// que lo exija una tecla escacharrada

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el texto: ");
		entradaDatos = sc.nextLine();
		sc.close();

		for (int i = 0; i < entradaDatos.length(); i++) { // recorre uno a uno cada posicion del String entradaDatos
			salidaDatos.insert(cursor, entradaDatos.charAt(i));// "cursor" indica en que posicion colocar el caracter de
																// posicion "i"
			caracter = entradaDatos.charAt(i);
			switch (caracter) {
			case '+':
				salidaDatos.deleteCharAt(cursor);
				cursor = salidaDatos.length() - 1;
				break;
			case '-':
				salidaDatos.deleteCharAt(cursor);
				cursor = 0;
				break;
			case '*':
				salidaDatos.deleteCharAt(cursor);
				cursor++;
				break;
			case '3':
				if (cursor < salidaDatos.length() - 1) {
					salidaDatos.deleteCharAt(cursor + 1);
				}
				salidaDatos.deleteCharAt(cursor);
				break;
			default:
				cursor++; // El cursor se desplaza una posicion despues de introducir un caracter
			}
		}
		System.out.println(salidaDatos);

	}
}
