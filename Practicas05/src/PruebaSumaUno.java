import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 19-12-2022 *
 ***************************************************/

/*
 * Cuando escribimos un número en decimal, usamos como dígitos los valores del 0
 * al 9. La posición de cada dígito indica el peso que tiene en el valor total
 * del número. Los números escritos en hexadecimal, por su parte, utilizan
 * dígitos del 0 al 15. Para representar los que superan el 9, necesitamos
 * símbolos nuevos. Para eso, se utilizan las letras de la A a la F, de manera
 * que, en hexadecimal, el número 9 es seguido por el A, o el BF por C0. ¿Eres
 * capaz de dar el siguiente número hexadecimal a uno dado?
 */

public class PruebaSumaUno {

	public static void main(String[] args) {

		// Entrada
		StringBuilder numeroB;
		StringBuilder numeroFinalB = new StringBuilder();
		int contador = 0;
		boolean verificar = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce numero hexadecimal:");
		// Pasamos la cadena a mayusculas para poder trabajar las letras por su valor
		// ascii en rango de mayusculas a la vez que usamos StringBuilder para mejorar
		// el tiempo de ejecucion y despues utilizar su metodo "reverse" en caso de que
		// la verificcion sea positiva. Tambien eliminamos tos los espacios que se hayan
		// podido introducir.
		numeroB = new StringBuilder(sc.nextLine().replace(" ", "").toUpperCase());
		sc.close();

		// Proceso

		// Verificamos que los datos equivalen a un numero hexadecimal mediante el valor
		// ascii de los caracteres numeros y letras mayusculas de la A a la F
		for (int i = 0; i < numeroB.length(); i++) {
			if (numeroB.charAt(i) >= '0' && numeroB.charAt(i) <= '9'
					|| numeroB.charAt(i) >= 'A' && numeroB.charAt(i) <= 'F') {
				contador++;
			} 
		}
		if (contador == numeroB.length()) {
			verificar = true; // True si los valores son correctos
		}

		if (verificar) {
			numeroB = numeroB.reverse(); // revertimos el orden de la cadena de caracteres para despues poder empezar
											// desde las unidades del numero hexadecimal
			int rango = 'F' - '0' + 1;

			for (int i = 0; i < numeroB.length(); i++) {
				int siguiente = (numeroB.charAt(i) - '0') + 1;

				if (numeroB.charAt(i) == '9') { // Asi saltamos todos los caracteres que se encuentran entre el 9 y la A
					numeroFinalB = numeroFinalB.append((char) ('A'));
				} else {
					int circular = siguiente % rango;
					if (i == 0) { // Cuando es el primer digito analizar
						numeroFinalB = numeroFinalB.append((char) (circular + '0'));
					}
					if (i > 0 && numeroB.charAt(i - 1) != 'F') { // En el caso de que haya mas de un digito a analizar pero no hay acarreo que sumar al siguiente
						numeroFinalB = numeroFinalB.append((char) (numeroB.charAt(i)));
					}
					if (i > 0 && numeroB.charAt(i - 1) == 'F') { // En el caso de que haya mas de un digito a analizar y hay acarreo que sumar al siguiente
						numeroFinalB = numeroFinalB.append((char) (circular + '0'));
					}
				}
				if (i == numeroB.length() - 1 && numeroB.charAt(i) == 'F') { // Si es el ultimo digito a analizar y conlleva acarreo 
					numeroFinalB = numeroFinalB.append((char) ('1'));
				}
			}
			System.out.println(numeroFinalB.reverse());

		} else {
			System.out.println("No has introducido un numero hexadecimal");
		}
	}
}