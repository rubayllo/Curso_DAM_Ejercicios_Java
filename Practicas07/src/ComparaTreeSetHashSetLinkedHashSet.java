import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparaTreeSetHashSetLinkedHashSet {

	public static void main(String[] args) {
		String[] listado = { "Beto", "Luis", "Inés", "Ana" };
		System.out.println("Listado de nombres: \t\t\t" + Arrays.toString(listado));

		LinkedHashSet<String> nombres = new LinkedHashSet<>(5);
		nombres.add(null);
		System.out.println("Pueden almacenar nulos: \t\t" + nombres);
		nombres.remove(null);

		nombres.addAll(Arrays.asList(listado));

		System.out.println("Nombres por orden de inscripción: \t" + nombres);

		System.out.println("¿Contiene a Ana y Beto?: \t\t" + nombres.containsAll(Set.of("Beto", "Ana")));

		TreeSet<String> ordenados = new TreeSet<>(nombres);
		System.out.println("Nombres por orden alfabético: \t\t" + ordenados);
	}

}