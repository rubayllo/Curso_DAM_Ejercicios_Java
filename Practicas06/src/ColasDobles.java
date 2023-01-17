
import java.util.Scanner;
import java.util.Stack;

public class ColasDobles {

	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		Stack<Character> pila = new Stack<>();
		System.out.print("Escriba la expresión con paréntesis: ");
		String expresion = sc.nextLine();
		char elemento;
		boolean resultado = true;

		// Proceso
		char[] expresionComoArray = expresion.toCharArray();
		for (int i = 0; i < expresionComoArray.length; i++) {
			elemento = expresionComoArray[i];
			if (elemento == '(')
				pila.push(elemento);
			else if (elemento == ')')
				if (pila.isEmpty() || pila.pop() != '(')
					resultado = false;
		}
		if (!pila.isEmpty())
			resultado = false;

		// Salida
		System.out.println(resultado ? "Expresión correcta" : "Expresión incorrecta");
		sc.close();
	}

}