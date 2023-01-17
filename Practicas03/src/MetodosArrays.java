import java.util.Arrays;

public class MetodosArrays {

	public static void main(String[] args) {
		// Entrada

		int[] numeros = new int[6];

		// Ingreso los numeros que van a salir premiados en el Euromillon en cada
		// posicion del array numeros

		numeros[0] = 10;
		numeros[1] = 1256;
		numeros[2] = 530;
		numeros[3] = 110;
		numeros[4] = 256;
		numeros[5] = 5310;

		// Veamos que se incluye en la variable hash gracias al metodo hashCode del
		// envoltorio Arrays
		
		int hash = Arrays.hashCode(numeros);

		System.out.println(Arrays.toString(numeros) + "\n");
		System.out.println(hash);

	}

}
