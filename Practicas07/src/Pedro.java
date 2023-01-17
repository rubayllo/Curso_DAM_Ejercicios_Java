import java.util.HashSet; 
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*
 * No cierra Scanner
 * No comprueba el nuemero de equipos introducidos
 */

public class Pedro {

	public static void main(String[] args) {

//INICIO

//Pedimos al usuario que introduzca 8 equipos de futbol

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 8 equipos de futbol separados por comas: ");
		String aspirantes = sc.nextLine();
//Separamos los aspirantes en un Array con el Método Split.

		String[] equiposSeparados = aspirantes.split(",");

//Creamos una nueva coleccion HashSet dimensionada en 8 posiciones.

		HashSet<String> miBombo = new HashSet<String>(8);

//Por cada equipo del Array, introducimos su valor en el bombo.

		for (String equipo : equiposSeparados) {
			miBombo.add(equipo);
		}

//PROCESO

		Random random = new Random();

//Recurso utilizado para generar un número aleatorio entre 0 y la longitud de la colección.
//Luego, con ese número, seleccionamos un elemento de la colección y lo eliminamos para evitar que se repita. 
//Creamos un bucle que se ejecute mientras queden equipos en el bombo.

		while (miBombo.size() > 0) { //una ejecución para el equipo local
			int indice = random.nextInt(miBombo.size());
			Iterator<String> itBombo = miBombo.iterator();
			String local = itBombo.next();

			for (int i = 0; i < indice; i++) {
				local = itBombo.next();
			}
			miBombo.remove(local);

//una ejecución para el equipo visitante

			int indice2 = random.nextInt(miBombo.size());

			Iterator<String> itBombo2 = miBombo.iterator();

			String visitante = itBombo2.next();

			for (int i = 0; i < indice2; i++) {
				visitante = itBombo2.next();
			}

			miBombo.remove(visitante);

//SALIDA

			System.out.println("Partido: " + local + " - " + visitante);
			sc.close();
		}
	}
}