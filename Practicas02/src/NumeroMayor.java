import java.util.Scanner;

/*
 * Utilizando la instrucción for, realiza un 
 * programa que lea por teclado 5 números enteros 
 * y determine cuál es el mayor
 */


public class NumeroMayor {

	public static void main(String[] args) {
		// Entrada
		Scanner sc = new Scanner(System.in);
	    int mayor = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Introduce el numero " + i + ": ");
			int c = sc.nextInt();
			if (c > mayor) {
				mayor = c;
			}
		}
		System.out.println("El mayor es: " + mayor);
		
		sc.close();
	}

}
