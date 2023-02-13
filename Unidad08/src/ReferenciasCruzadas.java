import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 30-01-2023 *
 ***************************************************/

/*
 * Dado un texto organizado por líneas, el problema de las
 * referencias cruzadas consiste en producir un listado de
 * palabras ordenado alfabéticamente, donde cada palabra 
 * del texto va acompañada de una lista de referencias que
 * contiene los números de todas las líneas del texto enlas 
 * que aparece la palabra en cuestión, ordenados de menor a 
 * mayor. En las listas de números de línea no habrá repeticiones 
 * (aunque la palabra aparezca varias vecesen en la misma línea)
 * Realiza un programa que lea varias líneas hasta encontrar “fin”.
 */

public class ReferenciasCruzadas {

	public static void main(String[] args) {
		
		// en "listaPalabras" se mete cada palabra que contenga cada linea
		// se utiliza esta opción ya que las listas permiten agregar un array
		// después se agragará "listaPalabras" a "palabrasNoRepetidas" ya que
		// al ser un conjunto no se agregarán las palabras repetidas
		// diccionario que agragará las palabras en orden alfabetico y como valor
		// tendrá los números de linea donde se encuentren las palabras.
		List<String> listaPalabras = new LinkedList<String>(); 
		LinkedHashSet<String> palabrasNoRepetidas = new LinkedHashSet <>(); 
		TreeMap<String, String > referenciaCruzada = new TreeMap<>(); 
		String entradaDatos;
		int linea = 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Introduce texto (letras) linea a linea pulsando <enter> y para finalizar escribe 'fin' y pulsa <enter>");
		do {
			System.out.printf("Linea %d: ", linea);
			entradaDatos = sc.nextLine().trim().replaceAll("[\s\t]+", " ").toLowerCase(); // Manejamos los datos de entrada ya depurados los posibles errores cometidos por el usuario
			if(!entradaDatos.matches("fin") && entradaDatos.matches("[ a-zA-Zá-úÁ-Ú]+")){ // Comprobamos que solo contenga letras
				listaPalabras = Arrays.asList(entradaDatos.split(" ")); // Está explicado al principio de las varibles
				palabrasNoRepetidas.addAll(listaPalabras); // Está explicado al principio de las varibles
	
				for (String palabra : palabrasNoRepetidas) { // Recorre el conjunto 
					if (referenciaCruzada.containsKey(palabra)) { // Al encontrar una palabra dentro del diccionario agregara un nuevo valor
						referenciaCruzada.put(palabra, referenciaCruzada.get(palabra) + " " + linea);
					} else if (!referenciaCruzada.containsKey(palabra)) { // en caso de no contener la palabra dentro del diccionario agraga la palabra y su primer valor al diccionario 
						referenciaCruzada.put(palabra, String.valueOf(linea));
					}

					}
				palabrasNoRepetidas.clear(); // Borra los datos que contenga para ser utilizada en la siguiente entrada
				linea++; // Suma una linea para la siguiente entrada
				
			} else if (!entradaDatos.matches("[ a-zA-Zá-úÁ-Ú]+")) { // Gestiona el mensaje de error en caso de introducir mal los datos
				System.out.println("\nPor favor introduce texto que contenga solo letras o escribe 'fin' para salir");
			}
			
		} while(!entradaDatos.matches("fin"));
		sc.close();

		// Salida que recorre el diccionario y lo muestra por pantalla
		for (Map.Entry<String, String> par : referenciaCruzada.entrySet()) {
			System.out.println(par.getKey() + " " + par.getValue());
		}
	}

}
