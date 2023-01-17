import java.util.Scanner;

/***********************************************
 * Autor: Ruben Ayllon * Fecha:   19-11-2022   *
 ***********************************************/

/*
 * Todos los años hay que elegir al delegado de clase y este año 
 * queremos hacer un programa que nos ayude. Por eso, hemos ordenado 
 * los alumnos de la clase por orden alfabético y les hemos dado un 
 * número consecutivo empezando por el 1. Aunque no sabemos cuántos 
 * alumnos hay, sí sabemos que no habrá más de 30. Para realizar las 
 * votaciones les pedimos a cada alumno que escriba en un papel el número 
 * de su candidato favorito (se pueden votar a sí mismos). 
 * Realiza un programa que lea las votaciones de los alumnos hasta encontrar 
 * un 0, que quiere decir que ya no hay más alumnos. El programa escribirá por 
 * pantalla el número del alumno que ha sido elegido delegado (si tiene más 
 * votos que el resto) o la palabra “EMPATE” en caso de que haya varios alumnos 
 * con la máxima cantidad de votos. Se garantiza que no hay votos nulos y que 
 * todos los alumnos escriben un número de un alumno que existe.
 */

public class ElegidDelegado {

	public static void main(String[] args) {
		// Entrada

		int[] alumno = new int[30];
		int votante = 1; // Numero del alumno que va a votar
		int voto = 0; // Numero del alumno votado
		int ganador = 0; // Numero del alumno ganador
		int recuento = 0; // Variable para saber que alumno a recibido mas votos
		boolean empate = false;

		Scanner sc = new Scanner(System.in);

		// Proceso para contabilizar los votos emitidos y verificar la entrada de datos
		do {
			System.out.print("Alumno " + (votante) + ": ");
			if (sc.hasNextInt()) {
				voto = sc.nextInt();
				if (voto <= 30 && voto > 0) {
					alumno[voto - 1] += 1; // Sumo un entero a la posicion votada (la posicion sera el voto-1)
					sc = new Scanner(System.in); // ante la posibilidad de que el usuario registre un gran numero de
					// retornos de carro, numeros separados por espacios o tabulacione he decidido reiniciar el
					// objeto sc a su valor inicial
					votante++;

				} else if (voto > 30 || voto < 0) { // Gestion del error de voto invalido
					System.out.println("Emita un voto del 1 al 30\n");
				}
			} else {
				System.out.println("No ha ingresado un numero de alumno.\n");
				sc = new Scanner(System.in); // ya explicado
				voto = -1; // esta linea de codigo evita que el programa salga del bucle en el caso de que
							// la primera entrada no sea un numero, comprobad en caso de no existir que
							// sucederia si ingreso una letra en la primera votacion
			}
		} while (votante <= 30 && voto != 0);

		sc.close();
		
		// Proceso para saber quien es el mas votado o si hay empate
		for (int i = 0; i < alumno.length; i++) {
			if (alumno[i] > recuento) { // Este bloque comparara el numero de votos que contiene cada posicion del array
										// y almacenara el resultado en la variable auxiliar "recuento"
				recuento = alumno[i];
				ganador = i + 1; // Como la cadena de Arrays desde el 0 y la variable alumnos quiero que empiece
									// desde el 1 para que sea mas legible, le he sumado un 1 a la posicion i para
									// que de el numero de alumno concreto
				empate = false;
			} else if (alumno[i] == recuento) {
				empate = true;
			}
		}

		// Salida por pantalla segun los resultados conseguidos
		if (empate) {
			System.out.println("EMPATE");
		} else {
			System.out.println(ganador);
		}

	}

}
