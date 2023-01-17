import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;


/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 16-01-2023 *
 ***************************************************/

/*
 * Un profesor de secundaria tiene el listado de alumnos de 
 * este año y el de los alumnos del año pasado. El Listado 
 * está ordenado por orden de matrícula y no quiere perderse 
 * ese orden. Al profesor le han pedido el listado de los 
 * alumnos repetidores (los que están en las dos listas). 
 * Realiza un programa que lea los nombres de los alumnos del 
 * año pasado y los alumnos de este año y muestre los alumnos 
 * repetidores por orden de matrícula.
 */

public class Repetidores {

	public static void main(String[] args) {

		LinkedHashSet<String> alumAntiguos = new LinkedHashSet<>();
		LinkedHashSet<String> alumNuevos = new LinkedHashSet<>();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Alumnos anterior curso: ");
		do {
			// Elimino cada espacio, punto o coma y los convierto en un espacio para crear
			// un array de cada elemento para introducirlo en el conjunto
			// Elimino todos los numeros
			alumAntiguos.addAll(Arrays.asList(sc.nextLine().replaceAll("[ .,]+", " ").replaceAll("[0-9]+", "").split(" ")));
		} while (alumAntiguos.size() == 0);
		
		System.out.print("Alumnos nuevo curso: ");
		do {
			// Elimino cada espacio, punto o coma y los convierto en un espacio para crear
			// un array de cada elemento para introducirlo en el conjunto
			// Elimino todos los numeros
			alumNuevos.addAll(Arrays.asList(sc.nextLine().replaceAll("[ .,]+", " ").replaceAll("[0-9]+", "").split(" ")));
		} while (alumNuevos.size() == 0);
		sc.close();
		

		alumNuevos.retainAll(alumAntiguos);
		
		for (String repetidores : alumNuevos) {
			System.out.println(repetidores);			
		}
	}

}
