import java.util.PriorityQueue;
import java.util.Queue;

public class EjercicioPasajeros {

	public static void main(String[] args) {

		Queue<Billete> pasajeros = new PriorityQueue<>();

		pasajeros.add(new Billete("Elena", 1));
		pasajeros.add(new Billete("Pedro", 3));
		pasajeros.add(new Billete("Marcos", 2));
		pasajeros.add(new Billete("Jesús", 1));
		pasajeros.add(new Billete("Luisa", 4));
		pasajeros.add(new Billete("Esther", 5));
		

		System.out.println("El primero en embarcar es:\n" + pasajeros.poll());
		System.out.println("\nEl resto de pasajeros:");
		while (!pasajeros.isEmpty())
			System.out.println(pasajeros.remove());

	}
}

class Billete implements Comparable<Billete> {

	private String nombre;
	private int prioridad;

	public Billete(String nombre, int prioridad) {
		this.nombre = nombre;
		this.prioridad = prioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrioridad() {
		return prioridad;
	}

	@Override
	public String toString() {
		return "Billete [nombre=" + nombre + ",\tprioridad=" + prioridad + "]";
	}

	@Override
	public int compareTo(Billete o) {
		return -Integer.compare(prioridad, o.getPrioridad());
	}
}
