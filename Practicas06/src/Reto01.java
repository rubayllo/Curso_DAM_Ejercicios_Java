import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Crea un programa que solicite por consola varios nombres separados por espacios:
 * Utiliza nextLine de la clase Scanner para leer la línea
 * Utiliza split para transformarlo en un array de Strings
 * Luego tienes que solicitar un nombre para intentar buscarlo entre los nombres introducidos anteriormente:
 * Utiliza el método next de Scanner para leer una palabra
 * A continuación, el programa debe buscar el nombre en la lista:
 * Utiliza indexOf para buscar
 */

public class Reto01 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una lista de nombres con espacios: ");
		List<String> listaNombres = Arrays.asList(sc.nextLine().split(" "));
		
		System.out.print("Introduce un nombre a buscar: ");
		int posicion = listaNombres.indexOf(sc.next());
		
		if(posicion>=0) {
			System.out.print("El nombre está en la posición: " + posicion);
		} else {
			System.out.print("El nombre no está en la lista");
		}
		sc.close();
		
	}

}
