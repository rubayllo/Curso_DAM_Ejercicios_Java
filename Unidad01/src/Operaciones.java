import java.util.Scanner;

public class Operaciones {
	public static void main(String[] args)  {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce primer byte: ");
		byte b1 = entrada.nextByte();

		System.out.print("Introduce segundo byte: ");
		byte b2 = entrada.nextByte();

		System.out.println();
		System.out.println("byte1 + byte2 = " + (b1 + b2));
		System.out.println("byte1 - byte2 = " + (b1 - b2));
		System.out.println("byte1 * byte2 = " + (b1 * b2));
		System.out.println("byte1 / byte2 = " + (b1 / b2));
		
		entrada.close();
	}
}
