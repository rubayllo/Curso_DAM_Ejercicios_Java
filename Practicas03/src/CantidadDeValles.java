import java.util.Scanner;

/*
 * Dadas las alturas de 9 montañas, llamamos “valle” a aquellas 
 * que tiene una montaña de mayor altura por su izquierda y por 
 * su derecha. Realiza un programa que solicite la altura 
 * (máximo 4000) de una cordillera de 7 picos y muestre la 
 * cantidad de valles que hay en ella. No puede haber dos alturas 
 * iguales seguidas.
 */


public class CantidadDeValles {
	public static void main(String[] args) {
		
		int[] alturas = new int[7];
		int picos;
		int valle = 0;
		boolean minimo = false;
		
		Scanner sc = new Scanner(System.in);
	    
		for (int i=0; i < alturas.length; i++) {

			System.out.print("Pico " + (i+1) + ": ");
			picos = sc.nextInt();

			if (i >= 1 && alturas[i - 1] != picos && picos > 0 && picos <= 4000) {
				alturas[i] = picos;
			} else if (i == 0) {
				alturas[i] = picos;
			} else {
				i--;
			}
		}

		for (int i = 0; i < alturas.length; i++) {

			if (i < alturas.length - 1) {

				if (alturas[i + 1] < alturas[i]) {
					minimo = true;
				}
				if (minimo && alturas[i] < alturas[i + 1]) {
					valle = valle + 1;
					minimo = false;
				}
			}

		}

		System.out.println(valle);

		sc.close();
	}

}
