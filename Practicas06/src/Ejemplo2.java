import java.util.LinkedList;

 public class Ejemplo2 {
	public static void main(String[] args) {
		LinkedList<String> miColeccion = new LinkedList<>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		miColeccion.add("List");
		miColeccion.add("List");
		miColeccion.add("List");
		
		//Borra todos los elementos "List"
		while (miColeccion.remove("List"));
		
		//Resultado
		System.out.println(miColeccion);

	}
 }