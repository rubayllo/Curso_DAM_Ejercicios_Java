import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Crea un programa que solicite por pantalla dos números, para generar un rango de valores:
 * Utilizar nextInt de Scanner para leer cada número
 * A continuación, debe solicitar otro número, para buscar sus múltiplos dentro del rango anterior.
 * El programa debe generar un ArrayList con todo el rango de números:
 * Utiliza un for para recorrer todo el rango y el método add para añadirlos a la lista.
 * El programa debe cambiar los números que no sean múltiplos por ‘0’:
 * Utiliza un for para recorrer la colección y set para cambiarlos.
 */

public class Reto02 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int multiplo;
		
		List<Integer> rangoNumeros = new ArrayList<>();

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número inicial: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduzca el número final: ");
		num2 = sc.nextInt();
		
		System.out.print("Múltiplos a localizar: ");
		multiplo = sc.nextInt();
		
		sc.close();
		
		for(int i = num1; i <= num2; i++) {
			rangoNumeros.add(i);
		}
		
		for(int i = 0; i < rangoNumeros.size(); i++) {
			if(rangoNumeros.get(i) % multiplo != 0 ) {
				rangoNumeros.set(i, 0);
			}
		}
		System.out.println(rangoNumeros);
	}

}
