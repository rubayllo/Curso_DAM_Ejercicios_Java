import java.util.Arrays;

public class ComparaArrays {

	public static void main(String[] args) {


		String[] Array1 = {"Hola", "que", "tal Firulais?"};
		String[] Array2 = {"Hola", "que", "tal Firulais?"};
		String[] Array3 = {"Hola", "tal Firulais?", "que"};
		

		System.out.println("Array1: " + Arrays.toString(Array1));
		System.out.println("Array2: " + Arrays.toString(Array2));
		System.out.println("Array3: " + Arrays.toString(Array3));

		
		System.out.println("\nArray 1 y 2 son iguales? " + Arrays.equals(Array1, Array2));
		System.out.println("Array 2 y 3 son iguales? " + Arrays.equals(Array1, Array3));
		
	}

}