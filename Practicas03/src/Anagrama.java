import java.util.Arrays;
import java.util.Scanner;

/*
 * El significado de Anagrama según la RAE es 
 * “Cambio en el orden de las letras de una palabra o 
 * frase que da lugar a otra palabra o frase distinta”. 
 * Construye un programa que lea dos palabras y diga SI 
 * en caso de una sea anagrama de la otra, es decir, si 
 * tiene las mismas letras. En caso contrario dirá NO. 
 * Ejemplos de anagramas son esponja y japones, letras y lastre 
 * o frase y fresa. Para hacer este programa se aconseja 
 * utilizar métodos como toCharArray de la clase String, por ejemplo:
 * char [] ArrayChars = “Ejemplo”.toCharArray();
 */

public class Anagrama {

	public static void main(String[] args) {
		// entrada

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce palabra 1: ");
		char [] palabra1 = sc.next().toLowerCase().toCharArray();
		Arrays.sort(palabra1);
		
		System.out.print("Introduce palabra 2: ");
		char [] palabra2 = sc.next().toLowerCase().toCharArray();
		Arrays.sort(palabra2);
		
		if(Arrays.equals(palabra1, palabra2)) {
		System.out.println("SI");
		} else {
		System.out.println("NO");
		}
		
		sc.close();
	}

}
