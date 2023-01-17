import java.util.Scanner;

/*
 * Utilizando la instrucción do-while, 
 * realiza un programa que lea una secuencia 
 * de notas (con valores que van de 0 a 10) 
 * que termina con el valor -1 e imprima “SI”
 * si ha habido algún 10 o “NO” en caso contrario. 
 */


public class HayDiezDoWhile {

	public static void main(String[] args) {

		int num = 0;
		boolean contador = false;

		// Entrada
		Scanner sc = new Scanner(System.in);
		
		// Proceso
		do {
			System.out.print("Introduce un número (0-10)");
			num = sc.nextInt();
			if (num == 10) {
				contador = true;
			}
			else if (num < -1 || num > 10) {
				System.out.println("Ese numero esta fuera de rango");
			}
		} while (num != -1); // La opcion -1 ejecutara la salida del bucle
		
		// Salida
		if (contador) {
			System.out.println("SI");

		} else {
			System.out.println("NO");
		}

		sc.close();
	}

}
