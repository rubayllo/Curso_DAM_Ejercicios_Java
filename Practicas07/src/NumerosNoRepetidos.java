import java.util.HashSet;
import java.util.Scanner;

/*
 * Realiza un programa que solicite números no repetidos. 
 * Cuando se introduzca un número repetido, el programa 
 * mostrará todos los números introducidos hasta ese momento.
 */

public class NumerosNoRepetidos {

	public static void main(String[] args) {

		HashSet<Integer> lista = new HashSet<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los números y pulse enter o dejee espacio entre cada numero:");

		while ( sc.hasNextInt() && lista.add(sc.nextInt()) );
		
		if(!sc.hasNextInt()) {
			System.out.println("Has introducido otro caracter diferente");
		}
		sc.close();

		System.out.print(!lista.isEmpty() ? "Los números introducidos son: " : "No has introducido ninugun numero");
		for (Integer c : lista) {
			System.out.print(c + " ");
		}
	}
}
