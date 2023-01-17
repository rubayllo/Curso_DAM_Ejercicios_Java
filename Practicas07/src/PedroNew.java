import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class PedroNew {

	public static void main(String[] args) {

		final int equiposTotales = 8;
		int iter = 0;
		HashSet<String> bombo = new HashSet<>();
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Introduce %d equipos de futbol (separados por comas o por retornos de carro):\n",
				equiposTotales);

		do { //Control de entrada de datos a maximo equiposTotales
			bombo.addAll(Arrays.asList(sc.nextLine().split(",")));
			if (bombo.size() < equiposTotales) {
				System.out.printf("Levas %d equipos inscritos faltan %d: \n", bombo.size(),
						equiposTotales - bombo.size());
			}
			if(bombo.size()> equiposTotales) {
				System.out.println("Has inscrito demasiados equipos vuelve a empezar:");
				bombo.clear();
				System.out.printf("Levas %d equipos inscritos faltan %d: \n", bombo.size(),
						equiposTotales - bombo.size());
			}
		} while (bombo.size() < equiposTotales);
		sc.close();

		LinkedList<String> partidos = new LinkedList<>(bombo); // Paso los datos a linkedList para poder modificar su
																// estructura

		while (!partidos.isEmpty()) {
			System.out.printf("Partido %d: ", ++iter);
			System.out.print(partidos.remove(random.nextInt(partidos.size())) + "\t - "
					+ partidos.remove(random.nextInt(partidos.size())) + "\n"); // Segun saco cada equipo los elimino de
																				// LinkedList
		}
	}
}
