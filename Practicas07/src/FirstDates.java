import java.util.Scanner;
import java.util.TreeSet;
 
 
public class FirstDates {
 
 
	public static void main(String[] args) {
		String entrada;
		String [] entradaSplit = null;
		boolean valido = false;
		Integer num;
		TreeSet<Integer> desparejados = new TreeSet<>();     // usamos TreeSet para que ordene ascendente
		Scanner scn = new Scanner(System.in);
		
		do {											//Pedimos los numeros y los metemos en un array.
			System.out.print("Introduzca los numeros: ");
			entrada = scn.nextLine();
			
			if(entrada.matches("[0-9[ ]]+")) {
				entrada = entrada.trim();                // quitamos espacios de los extremos
				if(!entrada.equals("")) {                // si queda algo 
				  entradaSplit = entrada.split("\s+");   // partimos por 1 o más espacios
				  valido = true;
				}
			}
			if(!valido) {
				System.out.print("Entrada erronea. ");
			}
			
		}while(!valido);
		scn.close();
		
		for(int i = 0; i < entradaSplit.length; i++) {      // si ya está el elemento lo quitamos de la lista de desparejados, si no lo añadimos
			num=Integer.parseInt(entradaSplit[i]);			// no tenemos en cuenta casuística de más de 2 entradas del mismo número (lo podríamos hacer con otro set de emparejados)
			if (!desparejados.add(num)) {   				
				desparejados.remove(num);
			}
		}
		
		if(desparejados.size() != 0) {                  // sacamos por pantalla el contenido
			for (Integer numero : desparejados) {
				System.out.printf("%d ", numero);
			}
			System.out.println();
		}
		else {
			System.out.println("No hay nadie desparejado.");
		}		
	}
}