import java.util.Arrays;
import java.util.Scanner;

/*
 * Un puzle infantil tiene 5 piezas y se ha perdido una. 
 * Por suerte, cada pieza está numerada. Realiza un 
 * programa que lea 4 números, que representan las piezas 
 * que hay y muestre por pantalla la pieza que falta
 */

public class LaPiezaPerdida {

	public static void main(String[] args) {
		// Entrada
		
		int[] piezasHay = new int[5];
		int pieza = 0;
		
		Scanner sc = new Scanner(System.in);
	    
		// Introducimos el numero de las piezas que hay
		// ordenadas en el array justo en la posicion que estarian
		//de menor a mayor
		
		for (int i = 0; i < piezasHay.length - 1; i++) {
			System.out.print("Pieza (1-5): ");
				pieza = sc.nextInt();
								
			if ( pieza>=1 && pieza<=5 && piezasHay[pieza-1] == 0) {
				piezasHay[pieza-1] = pieza;

			} else {
				System.out.println("Esa pieza esta repetida o es incorrecta prueba otra vez \n");
				i--;
			}
		}
		
		System.out.println(Arrays.toString(piezasHay) + "\n");

		
		// Ahora recorremos el array y buscamos que posicion nos devuelve 0
		// esa posicion mas uno seria exactamente la pieza que falta
		for (int i = 0; i < piezasHay.length; i++) {			
			if (piezasHay[i] == 0) {
				pieza = i+1;
			}
		}

		System.out.println(pieza);
		
	    sc.close();
	}

}
