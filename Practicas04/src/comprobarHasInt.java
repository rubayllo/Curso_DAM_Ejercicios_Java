import java.util.Scanner;

public class comprobarHasInt {

	public static void main(String[] args) {

		int[] cantidad = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < cantidad.length; i++) {
			System.out.print("Introduzca la coordenada (" + i + "): ");

			if (sc.hasNextInt()) {
				cantidad[i] = sc.nextInt();
				System.out.println("Perfecto\n");
				sc.nextLine();
			} else {
				System.out.println("\nError de datos introducidos");
				sc.nextLine();
			}
		}
		sc.close();
	}
}