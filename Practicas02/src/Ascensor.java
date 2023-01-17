import java.util.Scanner;

/*
 * Realiza un programa que calcule la cantidad 
 * de pisos recorridos por un ascensor. El trayecto
 * siempre empieza y termina en el piso 0 o Bajo. 
 * El ascenso va desde el piso 0 al piso 20.
 */

public class Ascensor {

	public static void main(String[] args) {
		// Entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los pisos (uno por línea)");
		int i = sc.nextInt();
		int suma = i;
		
		do {
			int c = sc.nextInt();
			if (c > i) {				
				suma = suma + (c - i);
			} else if (c < i) {
				suma = suma + (i - c);
			} 

			i = c;
			

		} while (i != 0);
		System.out.println(suma);
		sc.close();

	}

}
