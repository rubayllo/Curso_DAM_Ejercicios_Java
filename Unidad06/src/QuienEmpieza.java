import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 09-01-2023 *
 ***************************************************/

/*
 * Una profesora de primaria tiene alumnos numerados 
 * del 1 al 25 en clase y se ha inventado unsistema 
 * para ver quién es el que limpieza la pizarra cada día. 
 * Para ello, le pregunta el número declase al alumno que 
 * la limpió el día anterior. Si, por ejemplo, tiene el 
 * número 2, se saltan dosalumnos antes de eliminar a uno, 
 * es decir, se empieza por el 1 y se elimina al número 3, 
 * al 6, al 9,etc. Cuando se llega al final de la lista se 
 * continúa contando desde el principio respetando el saltode 3.
 *  Realiza un programa que pida el número del alumno que 
 *  salió el día anterior (del 1 al 25) y muestre por pantalla 
 *  el niño al que le toca borrar la pizarra hoy.
 */

public class QuienEmpieza {

	public static void main(String[] args) {

		final int NUMEROALUMNOS = 25; // Constante que puede variar con el tiempo sin afectar al resto del codigo
		Queue<Integer> aulaTotal = new LinkedList<>(); // utilizo Queue para crear una cola de entrada y salida datos
		int alumnoLimpiaAyer = 0;
		boolean comprobado = false;
		
		for(int i=1; i <= NUMEROALUMNOS; i++) { // Inicio el Arraylist "aulaTotal" todos los alumnos que hay en la escuela
			aulaTotal.offer(i);
		}

		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("¿Que alumno ha limpiado ayer? (Rango 1 - %d): \n", NUMEROALUMNOS);
			if (sc.hasNextInt()) { // verifico entrada
				alumnoLimpiaAyer = sc.nextInt();
				if (alumnoLimpiaAyer >= 1 && alumnoLimpiaAyer <= NUMEROALUMNOS) { // valido el rango
					comprobado = true;
				} else {
					System.out.printf("El rango debe estar entre 1 - %d!\n", NUMEROALUMNOS);
				}
			} else {
				System.out.print("Intrduce un numero valido!!!\n");
			}
			sc.nextLine();
		} while (!comprobado);

		sc.close();

		while (aulaTotal.size() != 1) { // Bucle que hara que la lista se mueva de manera circular hasta que solo quede 1 elemento
			for (int j = 1; j <= alumnoLimpiaAyer; j++) { // Bucle que finaliza justo en el numero del alumno que marca el salto
				aulaTotal.offer(aulaTotal.poll()); // El primer elemento se elimina y a la vez se inserte en el final de la Lista
			}
			aulaTotal.poll(); // Elimino el alumno que se encuentra en primer lugar
		}

		System.out.println(aulaTotal.peek());
	}
}
