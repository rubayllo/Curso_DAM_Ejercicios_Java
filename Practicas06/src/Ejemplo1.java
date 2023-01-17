import java.util.Iterator;
 import java.util.LinkedList;

 public class Ejemplo1 {
	public static void main(String[] args) {
		LinkedList <String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
 
		String elto;
		Iterator<String> paseador = miColeccion.iterator();

		while (paseador.hasNext()){
			elto = paseador.next();
			if (elto.charAt(0)=='S') {
				//Borra el elemento
				paseador.remove(); 
 			} else { 
				System.out.print(elto + " ");
			}
		}
		
		System.out.println("\n" + miColeccion);
	}
 }