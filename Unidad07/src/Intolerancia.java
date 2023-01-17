import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 16-01-2023 *
 ***************************************************/

/*
 * Eduardo acaba de descubrir que tiene intolerancia a algunos alimentos, pero
 * no sabe cuáles. La comida de hoy le ha sentado bien, pero la de ayer no. El
 * programa debe solicitar los ingredientes que comió en ayer y los que comió
 * hoy. Todos los que comió hoy se consideran seguros, pero alguno de los que
 * comió ayer es potencialmente peligroso, ¿sabrías decir cuáles son?
 */

public class Intolerancia {

	public static void main(String[] args) {

		// Utilizo HashSet por ser mas rapido
		HashSet<String> ayerRiesgo = new HashSet<>();
		HashSet<String> hoySeguro = new HashSet<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Comida de ayer (riesgo): ");
		do {
			// Elimino cada espacio, punto o coma y los convierto en un espacio para crear
			// un array de cada elemento para introducirlo en el conjunto
			// Elimino todos los numeros
			ayerRiesgo.addAll(Arrays.asList(sc.nextLine().replaceAll("[ .,]+", " ").replaceAll("[0-9]", "").split(" ")));
		} while (ayerRiesgo.size() == 0);

		System.out.print("Comida de hoy (segura): ");
		do {
			// Elimino cada espacio, punto o coma y los convierto en un espacio para crear
			// un array de cada elemento para introducirlo en el conjunto
			// Elimino todos los numeros
			hoySeguro.addAll(Arrays.asList(sc.nextLine().replaceAll("[ .,]+", " ").replaceAll("[0-9]", "").split(" ")));
		} while (hoySeguro.size() == 0);
		sc.close();

		ayerRiesgo.removeAll(hoySeguro);
		System.out.println(ayerRiesgo);
	}

}
