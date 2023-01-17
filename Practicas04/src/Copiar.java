import java.util.Arrays;

public class Copiar {

	public static void main(String[] args) {
		// Declaración e inicialiazación
		int[] primos = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		int[] copia = new int[primos.length];

		// Copia
		System.arraycopy(primos, 1, copia, 3, 6);

		// Salida
		System.out.println(Arrays.toString(primos));
		System.out.println(Arrays.toString(copia));
	}
}