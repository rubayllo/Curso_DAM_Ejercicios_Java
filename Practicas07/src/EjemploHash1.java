import java.util.Set;

public class EjemploHash1 {

	public static void main(String[] args) {
		Set<String> conjuntoB = Set.of("Luis", "Ana", "Ines", "Beto");
		Set<String> conjuntoB2 = Set.of("Beto", "Luis", "Ines", "Ana");
		Set<String> conjuntoN = Set.of("Pedro", "Ana", "Beto");

		System.out.println("Conjunto B: \t" + conjuntoB);
		System.out.println("Conjunto B2: \t" + conjuntoB2);
		System.out.println("Conjunto N: \t" + conjuntoN);

		System.out.println("Luis en B: \t" + conjuntoB.contains("Luis"));
		System.out.println("Luis en N: \t" + conjuntoN.contains("Luis"));

		System.out.println("B igual a B2: \t" + conjuntoB.equals(conjuntoB2));
		System.out.println("B igual a N: \t" + conjuntoB.equals(conjuntoN));

	}
}