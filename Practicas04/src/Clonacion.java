import java.util.Arrays;

public class Clonacion {
	public static void main(String[] args) {
		// Declaración e inicialiazación
		int[] primos = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		int[] copiaClonado;
		int[] copiaReferencia;

		// Clonación
		copiaClonado = primos.clone();
		// Cambio el clon, sin afectar al original
		copiaClonado[0] = 0;
		// Copia de referencia
		copiaReferencia = primos;
		// Cambio la copia y afecta al original
		copiaReferencia[1] = 0;

		// Salida
		System.out.println(Arrays.toString(primos));
		System.out.println(Arrays.toString(copiaClonado));
		System.out.println(Arrays.toString(copiaReferencia));//Tambien cambia el valor de su array de referencia o primitivo

	}
}