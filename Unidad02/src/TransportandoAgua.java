import java.util.Scanner;

/*
 * Realiza un programa que solicite una cantidad 
 * de litros de agua (número entero entre 1 y 1000) 
 * y las reparta entre botellas de 5, 2 y medio 
 * litro. Para facilitar el transporte, se debe 
 * tratar de ocupar el menor número posible de botellas. 
 * El programa debe indicar cuántas botellas de cada 
 * tipo se han utilizado. No se pueden utilizar bucles. 
 * Revisa la utilidad de los operadores % y /
 */

public class TransportandoAgua {

	public static void main(String[] args) {

		// Entrada
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de litros de agua (1-1000): ");
		int litros = sc.nextInt();

		// Proceso
		int botCinco = litros / 5; // Numero de botellas de 5 litros
		int botDos = (litros % 5) / 2; // Para calcular las botellas de 2 litros necesitamos el resto de la division de
									// las botellas de 5 litros
		int botMedio = (int) (((litros % 5) % 2) / 0.5); // Igualmente para calcular las botellas de 0.5 litros necesitamos
													// el resto de la division de las botellas de 2 litros. Para que sea
													// acorde al ejemplo necesitamos que "botMedio" sea un numero entero
													// algo imposible de conseguir dada que la division entre 0.5, nos obliga
													// que sea un numero real. Para ello he realizado la conversión a numero 
													// entero mediante una llamada "Cast"
													

		// Salida
		System.out
				.println(botCinco + " botellas de 5, " + botDos + " botellas de 2 y " + botMedio + " botellas de 1/2");

		sc.close();
	}

}
