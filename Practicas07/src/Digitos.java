import java.util.HashSet;
import java.util.Scanner;
 
 
public class Digitos {
 
 
		public static void main(String[] args) {
			HashSet <Integer> digitos = new HashSet <> ();
			String entrada;
			Integer num;
			boolean valido=false;
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.print("Introduce un número: ");
				entrada=sc.nextLine();
				if(entrada.matches("[0-9]+")) //// Esta expresión regular solo admite dígitos (0-9), 1 o más 
					valido = true;
				else
					System.out.print("Entrada erronea. ");				
			}while(!valido);
			sc.close();
			
			for(int i=0; i<entrada.length();i++) {
				char letra = entrada.charAt(i);               // Accedemos a cada caracter del string
				num= Integer.valueOf(String.valueOf(letra)); // convertimos letra en un entero para añadirlo a nuestro set
				digitos.add(num); 
			}
			
			System.out.print(digitos.size() +": "); //Cantidad de dígitos diferentes es el tamaño del set
			System.out.println(digitos);			//    (no pedido en el ejemplo)
			
		}
	}