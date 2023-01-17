import java.util.Scanner;

/*
 * Realizar un programa que pida la cantidad del 
 * préstamo que solicitamos a una entidad bancaria. 
 * A partir de ese momento, se irán introduciendo 
 * valores que serán las distintas aportaciones que 
 * se hacen para devolver el préstamo. Por cada 
 * aportación el programa mostrará el importe pendiente. 
 * El programa termina cuando suma de las aportaciones 
 * sea igual o superior al préstamo solicitado. Todos los 
 * valores pueden ser número reales (con decimales)
 */

public class Prestamo {

	public static void main(String[] args) {

		float devolucion = 0;

		// Entrada
		Scanner sc = new Scanner(System.in);
		System.out.print("Importe del préstamo: ");
		float prestamo = sc.nextFloat();
		
		// Proceso y Salida
		while (prestamo >= 0) {
			devolucion = sc.nextFloat();
			prestamo -= devolucion;
			if (prestamo > 0) {
				System.out.println(prestamo);
			}
		}
		sc.close();
	}

}
