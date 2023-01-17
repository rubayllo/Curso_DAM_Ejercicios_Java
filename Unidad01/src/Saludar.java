import java.util.Scanner;

public class Saludar {
	public static void main(String[] args)  {
		Scanner entrada = new Scanner (System.in);

		System.out.print("Introduzca su nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("Hola " + nombre);
		
		entrada.close();
	}
}
