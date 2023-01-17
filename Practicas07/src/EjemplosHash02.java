import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EjemplosHash02 {

	public static void main(String[] args) {
		Collection<String> fruta = new HashSet<>();
		fruta.addAll(Arrays.asList("Platano", "Mazana", "Naranja", "Pera"));
		System.out.println("Orden de la fruta: " + fruta);

		Set<String> conjuntoB = new HashSet<>(Arrays.asList("Luis", "Ana", "Ines", "Beto"));
		HashSet<String> conjuntoN = new HashSet<>(5);
		
		conjuntoN.add("Ana");
		conjuntoN.add("Beto");
		conjuntoN.add("Pedro");
		conjuntoN.add("Pedro");
		
		System.out.println(conjuntoN);
		System.out.println(conjuntoB);

		conjuntoB.retainAll(conjuntoN);
		System.out.println("Conjunto interseccion B y N: " + conjuntoB);
	}
}