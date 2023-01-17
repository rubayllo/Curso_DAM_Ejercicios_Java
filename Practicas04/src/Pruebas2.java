
import java.util.Arrays;
import java.util.Scanner;

public class Pruebas2 {

	public static void main(String[] args) {

		int[] arrayNumerico = new int[10];
		String auxiliar;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrayNumerico.length; i++) {

			System.out.print("Introduzca numero (" + i + "): ");

			if (sc.hasNextInt()) { // comprobamos que se introduce un numero entero
				auxiliar = sc.next();
				
				if(sc.nextLine().replaceAll(" ", "")=="") { // comprobamos que no han introducido nada mas
					System.out.println("Correcto");
					arrayNumerico[i] = Integer.parseInt(auxiliar);
				} else {
					System.out.println("Incorrecto 1");
					i--;
				}
			} else {
				System.out.println("incorrecto 2");
				i--;
				sc.nextLine();
			}
		}
		sc.close();
		System.out.println(Arrays.toString(arrayNumerico));
	}
}
