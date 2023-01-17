import java.util.ArrayList;
import java.util.LinkedList;

public class Debate {

	public static void main(String[] args) {

		final int NUMEROS = 100000;
		final int INICIO = 2;
		LinkedList<Integer> linkedLista = new LinkedList<>();
		ArrayList<Integer> arrayLista = new ArrayList<>();
		long start;
		long result;
		
		// Creo una lista de dos elemntos en LinkedList y otra en ArrayList
		for (int i = 1; i <= INICIO; i++) {
			linkedLista.add(i);
			arrayLista.add(i);
		}

		// Añado justos en la posicion 1 de LinkedList todos los elementos
		start = System.currentTimeMillis();		
		for (int i = 1; i <= NUMEROS; i++) {
			linkedLista.add(1, i);
		}
		result = (System.currentTimeMillis() - start);
		System.out.println("Tiempo total LinkedList: " + result + " Milisegundos");

		
		// Mismo ejemplo pero con ArrayList
		start = System.currentTimeMillis();		
		for (int i = 1; i <= NUMEROS; i++) {
			arrayLista.add(1, i);
		}
		result = (System.currentTimeMillis() - start);
		System.out.println("Tiempo total ArrayList: " + result + " Milisegundos");
	}
}
