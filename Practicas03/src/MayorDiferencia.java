import java.util.Arrays;
import java.util.Scanner;

/*
 * Realiza un programa que solicite las notas de 5 
 * alumnos y luego muestre la mayor diferencia entre 
 * las notas. Las notas se deben almacenar en un array 
 * y se deben utilizar bucles de tipo for
 */

public class MayorDiferencia {

	public static void main(String[] args) {
		// Entrada
		
		int[] notas = new int[5];
		
		Scanner sc = new Scanner(System.in);

		// 	Introducimos las notas en el array 
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduzca la nota del alumno"+ (i+1) + ": ");
			notas[i] = sc.nextInt();
		}

		// 	Organizamos el array de menor a mayor y 
		// una vez colocado resto el ultimo valor del array (que es el mayor de todos) 
		// con el primer valor del array (que es el menor de ellos)
		Arrays.sort(notas);
		System.out.println(notas[4] - notas[0]); 
		
		sc.close();
	}

}
