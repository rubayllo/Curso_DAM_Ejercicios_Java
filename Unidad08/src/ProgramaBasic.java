
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 30-01-2023 *
 ***************************************************/

/*
 * Quizá te suene el lenguaje de programación BASIC, con él 
 * nos iniciamos muchos en laprogramación. Recuerdo leer la 
 * revista ZX, donde venían muchos códigos de ejemplo, que 
 * comopeculiaridad tenían al principio de cada instrucción 
 * el número de línea. Esa numeración (que podíatener huecos 
 * entre una línea y la siguiente) se utilizaba también a modo 
 * de etiqueta en lasinstrucciones de salto.Imagina que ese 
 * lenguaje tuviera las siguientes instrucciones:
 * 
 * • PRINT: Imprime 
 * el texto que va entre comillas
 * 
 * • GOTO: Salta a la línea que 
 * viene a continuación
 * 
 * • REM: Es un comentario que no debe 
 * ejecutarse
 * 
 * • END: Termina el programaEl problema añadido 
 * es que se han alterado el orden de las instrucciones.
 *  
 * El programa termina cuando se encuentra la palabra “fin”
 * ¿Serías capaz de ejecutar un programa en este lenguaje?
 */

public class ProgramaBasic {

	public static void main(String[] args) {

		final String COMANDOSMATCH = "(REM)|(PRINT)|(GOTO)|(END)";
		final int ARRAYMAXIMALONGITUD = 3;
		final int ARRAYMINIMALONGITUD = 2;
		final int MAXIMOVALOR = Integer.MAX_VALUE;
		final int MAXIMASLINEAS = Integer.MAX_VALUE / (Integer.toString(MAXIMOVALOR).length());
		final int MAXIMOSCARACTERESVALORLINEA = Integer.toString(MAXIMASLINEAS).length();

		String entradaComando[];
		String instruccionFinal[];
		String lineaDeCodigo = "";
		
		boolean infinito = false;

		Queue<String> programaEjecucion = new LinkedList<>();
		TreeMap<Integer, String> programaBasic = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Puedes comenzar a escribir tu programa BASIC:");
		
		// Comienza la comprobación de entrada de datos e introduccion de los mismos dentro de TreeMap
		do {
			entradaComando = sc.nextLine().trim().replaceAll("[\s\t]", " ").split(" ", ARRAYMAXIMALONGITUD);
 
			if (entradaComando[0].matches("[0-9]+") && entradaComando.length > 1
					&& entradaComando[1].toUpperCase().matches(COMANDOSMATCH)) {
				
				if (entradaComando[0].length()<=MAXIMOSCARACTERESVALORLINEA && Integer.parseInt(entradaComando[0]) <= MAXIMASLINEAS ) {					
					switch (entradaComando[1].toUpperCase()) {
					case "REM": // Se realiza la comprobación verificando que después del comando REM se escribe algo sin comillas
						if (entradaComando.length == ARRAYMAXIMALONGITUD && entradaComando[2].charAt(0) != 34
								&& entradaComando[2].charAt(entradaComando[2].length() - 1) != 34) {
							programaBasic.put(Integer.parseInt(entradaComando[0]),
									entradaComando[1].toUpperCase() + " " + entradaComando[2]);
						} else {
							System.out.println(
									"\nLinea de codigo mal escrita. La funcion REM requiere de ser seguida de una expresión");
							System.out.println(
									"que NO esté envuelta por comillas. Escribe una linea de código válida o escribe FIN para terminar");
						}
						break;
	
					case "PRINT": // Se realiza la comprobación verificando que después del comando PRINT se escribe algo entre comillas
						if (entradaComando.length == ARRAYMAXIMALONGITUD && entradaComando[2].charAt(0) == 34
								&& entradaComando[2].charAt(entradaComando[2].length() - 1) == 34) {
							programaBasic.put(Integer.parseInt(entradaComando[0]),
									entradaComando[1].toUpperCase() + " " + entradaComando[2]);
						} else {
							System.out.println(
									"\nLinea de codigo mal escrita. La funcion PRINT requiere de ser seguida de una expresión");
							System.out.println(
									"envuelta por comillas. Escribe una linea de código válida o escribe FIN para terminar");
						}
						break;
	
					case "GOTO": // Se realiza la comprobación verificando que después del comando GOTO se escribe un número
						if (entradaComando.length == ARRAYMAXIMALONGITUD && entradaComando[2].matches("[0-9]+")) {
							programaBasic.put(Integer.parseInt(entradaComando[0]),
									entradaComando[1].toUpperCase() + " " + entradaComando[2]);
						} else {
							System.out.println(
									"\nLinea de codigo mal escrita. La funcion GOTO requiere de ser seguida exclusivamente");
							System.out.println(
									"por una expresión númerica. Escribe una linea de código válida o escribe FIN para terminar");
						}
						break;
	
					case "END": // Se realiza la comprobación verificando que después del comando END no se escribe nada
						if (entradaComando.length == ARRAYMINIMALONGITUD) {
							programaBasic.put(Integer.parseInt(entradaComando[0]), entradaComando[1]);
						} else {
							System.out.println(
									"\nLinea de codigo mal escrita. La funcion END no requiere de más expresiones");
							System.out.println("introduce una linea de código válida o escribe FIN para terminar");
						}
						break;
	
					default: //dejo esta instrucción ya colocada por si acaso es de utilidad en un futuro desarrollo de este ejercicio
						break;
					}	
				} else {
					System.out.printf("\nLo siento el numero máximo de lineas que puedes introducir es: %s\n y has introducido el número %s que lo supera.\n", MAXIMASLINEAS, entradaComando[0]);
					System.out.println("\nIntroduce una linea de código válida o escribe FIN para terminar");
				}			
				
			} else if (!entradaComando[0].toLowerCase().matches("fin")) {
				System.out.println("\nLo que has escritono no tiene sentido o es erróneo. Por favor");
				System.out.println("introduce una linea de código válida o escribe FIN para terminar");
			}
		} while (entradaComando.length > 0 && !entradaComando[0].toLowerCase().matches("fin"));
				
		// Comineza la parte del proceso del programa
		// Ahora que ya los tengo ordenados se meten en un LinkenList para mantener su orden	
		for (Map.Entry<Integer, String> par : programaBasic.entrySet()) {
			programaEjecucion.add(Integer.toString(par.getKey()));
			programaEjecucion.add(par.getValue());			
		}
		
		// Se procede a hacer funcionar el programa escrito en BASIC
		// Además se comprueba que no sea un bucle infinito.
		// Si se ha gestionado bien el primer la entrada de datos
		// el primer elemento de la lista debe ser un número
		
		int cuentaBucleGeneral = programaEjecucion.size(); // Recojo el tamaño total de la lista

		while (!programaEjecucion.peek().contentEquals("END") && !infinito) {
			if (programaEjecucion.peek().matches("[0-9]+")) {
				// Si el primer elemento es un número ya sabemos que el siguiente es una instrucción
				// se saca de la lista y se introduce al final para dar paso al siguiente dato
				lineaDeCodigo = programaEjecucion.peek();
				programaEjecucion.offer(programaEjecucion.poll());
			} else { // El siguiente dato es una instrucción y comienza a ejecutarse según el caso
				// Se divide el dato en un máximo de 2 datos, el primero contiene la instrucción y el
				// segundo si se requiere será la acción a ejecutar
				instruccionFinal = programaEjecucion.peek().split(" ", 2);
				
				switch (instruccionFinal[0]) {
				case "REM":
					programaEjecucion.offer(programaEjecucion.poll());
					break;

				case "PRINT":
					// Voy a ignorar las comillas del principio y del final y a sacar por pantalla lo de dentro
					for (int i=0; i<instruccionFinal[1].length(); i++) {
						if(i>0 && i<instruccionFinal[1].length()-1) {
							System.out.print(instruccionFinal[1].charAt(i));
						}
					}
					System.out.println();//para saltar de linea la proxima vez que se imprima algo por pantalla
					programaEjecucion.offer(programaEjecucion.poll());
					break;

				case "GOTO":
					// Hago que la cola se mueva hasta el lugar indicado mediante el siguiente bucle
					// Además compruebo que no sea un bucle infinito bloqueando su ejecución en ese caso
					int compruebaInfinito = programaEjecucion.size();
					while ( !programaEjecucion.peek().contentEquals(instruccionFinal[1]) && !infinito )  {
						programaEjecucion.offer(programaEjecucion.poll());
						compruebaInfinito--;
						if(compruebaInfinito<0) {
							infinito = true;
							System.out.printf("\nLo siento tienes un bucle infinito en la instruccion %s\n y he tenido que parar la ejecución del programa\n", lineaDeCodigo);
						}
					}
					break;

				case "END":
					break;
	
				default: // Se deja escrito esta instrucción por si algún día se necesita
					break;
				}
			}
			cuentaBucleGeneral--;
			if(cuentaBucleGeneral < 0) {
				infinito = true;
				System.out.printf("\nLo siento tienes un bucle infinito por falta de una instrucción END\ndentro de tu código o por un GOTO que se salta esa instrucción.\nHe tenido que parar el programa\n");

			}
		}	
		
		System.out.println("\nPROGRAMA TOTALMENTE EJECUTADO\n");
		sc.close();
	}

}
