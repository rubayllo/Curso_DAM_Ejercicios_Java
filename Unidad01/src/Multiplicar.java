import java.util.Scanner;

public class Multiplicar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número [1-10]: ");
			int n1 = entrada.nextByte();

			System.out.println();
			
			for (int i = 1; i < 11; i++) {
				System.out.println(n1 + " x " + i + " = " + (n1 * i));
			}
	entrada.close();

	}
}
