
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/***************************************************
 * Autor: Ruben Ayllon * Fecha entrega: 18-01-2023 *
 ***************************************************/


/*
 * Programa que pide ciertas acciones 
 * donde se valorara que un inventario tenga productos
 * para que puedas utilizar, en caso contrario
 * te pedira que hagas la compra.
 * Mientras que compres y uses el inventario actualizara 
 * sus productos y la cantidad que hay de cada uno
 */

public class GestionaTuInventario {

	public static void main(String[] args) {

		// Si el MENU lo quieres cambiar siempre pon primero un numero
		// diferente entre parentesis para que pueda funcionar en cada opcion
		// recuerda que el numero debera estar viculado con el switch-case que
		// encontraras un poco mas abajo
		final String[] MENU = { "(1) Usar", "(2) Comprar", "(4) Salir", "(13) Proximo numero de la loteria" };
		final int maximoEntero = Integer.MAX_VALUE;
		final int maximoValor = maximoEntero/10;
		final int maximosCaracteres = Integer.toString(maximoEntero).length();
		

		int i = 0; // Recojera la opcion elegida
		int cantidadCompradaUsada = 0;
		String consulta;
		StringBuilder objetoElegido = new StringBuilder();
		boolean salir = false;
		boolean modificaInventario = false;

		TreeMap<StringBuilder, Integer> inventarioTotal = new TreeMap<>();



		Scanner sc = new Scanner(System.in);

		do {
			// No he encontrado la manera de quitar los corchetes dentro de la misma
			// expresion
			System.out.println("¿Que numero de opcion deseas hacer?:\n" + Arrays.toString(MENU).replace("[", "").replace("]", ""));
			consulta = sc.nextLine();
			consulta = consulta.trim();

			if (consulta.split("\s").length == 1 && consulta.matches("[0-9]")) {
				i = Integer.parseInt(consulta);
				switch (i) {
				case 1:
					System.out.print("Ummm parece que quieres " + MENU[i - 1].replaceAll("[( )0-9]+", "").toLowerCase()
							+ " algo");
					if (inventarioTotal.size() > 0) {
						System.out.println(" y esto es lo que tienes disponible en tu inventario: ");
						for (Map.Entry<StringBuilder, Integer> par : inventarioTotal.entrySet()) {
							System.out.println(par.getKey() + " -> " + par.getValue());
						}

						do {
							System.out.print("\n¿Que deseas usar? ");
							consulta = sc.nextLine();
							if (consulta.trim().replaceAll("[ ]+", " ").matches("[a-zA-Z ]+")) {
								// Elimino los datos de objetoElegidopara insertar un nuevo nombre
								objetoElegido.delete(0, objetoElegido.length());
								// Configuro la primera letra del String en mayuscula
								objetoElegido.append(consulta.toUpperCase().charAt(0));
								// Configuto el resto del String en minusculas
								objetoElegido.append(consulta.substring(1, consulta.length()).toLowerCase()); 

								while (!modificaInventario) {
									System.out.print("¿Que cantidad deseas utilizar? ");
									consulta = sc.nextLine().trim();
									// Si solo ha introducido un dato y solo contiene numeros del 0 al 9
									if (consulta.matches("[0-9]+") && consulta.split("\s").length == 1) {
										
										if (consulta.length()<maximosCaracteres && Integer.parseInt(consulta) <= maximoValor) {
											cantidadCompradaUsada = Integer.parseInt(consulta);
											modificaInventario = true;										
										} else {
												System.out.println("Donde vas con tanto, no tienes suficiente inventario para utilizar");		
											}
									} else {
										System.out.println("Introduce una cantidad correcta, por favor");
									}
								}
							} else {
								System.out.print("\nPor favor introduce solo letras aunque sea una palabra rusa.");
							}
						} while (!modificaInventario);
						modificaInventario = false;

						if (inventarioTotal.containsKey(objetoElegido)) {
							// En el siguiente caso me aseguro de que quedara inventario en el mapa
							if ((inventarioTotal.get(objetoElegido) - cantidadCompradaUsada) > 0) {
								inventarioTotal.put(objetoElegido, inventarioTotal.get(objetoElegido) - cantidadCompradaUsada);
								System.out.printf("Has eliminado %d a tu inventario de %s\n\n", cantidadCompradaUsada,
										objetoElegido);
							// En el siguiente caso elimino del mapa cuando queden 0 objetos
							} else if ((inventarioTotal.get(objetoElegido) - cantidadCompradaUsada) == 0) {
								inventarioTotal.remove(objetoElegido);
								System.out.printf("Ya no te queda %s en tu inventario\n\n", objetoElegido);
							} else {
								// en este caso el resultado habria dado negativo
								System.out.println("No tienes tanta cantidad para usar...\n");
							}
						} else {
							inventarioTotal.put(objetoElegido, cantidadCompradaUsada);
						}
					} else {
						System.out.print(" pero ctualmente el inventario lo tienes vacio.");
						System.out.println("\nPrueba a comprar algo!!!! \n");
					}
					break;

				case 2:
					System.out.print("\nUmmm parece que quieres "
							+ MENU[i - 1].replaceAll("[( )0-9]+", "").toLowerCase() + " algo");
					if (inventarioTotal.size() > 0) {
						System.out.println(" y esto es lo que tienes disponible en tu inventario: ");
						// Itero sobre el mapa total y muestro resultados por pantalla
						for (Map.Entry<StringBuilder, Integer> par : inventarioTotal.entrySet()) {
							System.out.println(par.getKey() + " -> " + par.getValue());
						}
					} else {
						System.out.print(" y es logico tienes el inventario vacio.");
					}

					do {
						System.out.print("\n¿Que deseas comprar? ");
						consulta = sc.nextLine();
						if (consulta.trim().replaceAll("[ ]+", " ").matches("[a-zA-Z ]+")) {
							// elimino los datos de objetoElegido para insertar un nuevo nombre
							objetoElegido.delete(0, objetoElegido.length()); 
							// Configuro la primera letra en mayuscula
							objetoElegido.append(consulta.toUpperCase().charAt(0)); 
							// Configuto el resto del String en minusculas
							objetoElegido.append(consulta.substring(1, consulta.length()).toLowerCase()); 

							while (!modificaInventario) {
								System.out.print("¿Que cantidad deseas comprar? ");
								consulta = sc.nextLine().trim();
								if (consulta.matches("[0-9]+") && consulta.split("\s").length == 1) {									
									if (consulta.length()<maximosCaracteres && Integer.parseInt(consulta) <= maximoValor) {
										cantidadCompradaUsada = Integer.parseInt(consulta);
										modificaInventario = true;
									} else {
										System.out.println("Donde vas con tanto, no tienes suficiente hueco para tanto genero");		
										System.out.printf("El maximo de compra es de %d unidades\n", maximoValor);		
									}
								} else {
									System.out.println("Introduce una cantidad correcta, por favor");
								}
							}
						} else {
							System.out.print("\nPor favor introduce solo letras aunque sea una palabra rusa.");
						}
					} while (!modificaInventario);
					modificaInventario = false;

					if (inventarioTotal.containsKey(objetoElegido)) {
						if ((inventarioTotal.get(objetoElegido) + cantidadCompradaUsada) < maximoValor) {
							inventarioTotal.put(objetoElegido, inventarioTotal.get(objetoElegido) + cantidadCompradaUsada);
							System.out.printf("Has agregado %d a tu inventario de %s\n\n", cantidadCompradaUsada, objetoElegido);
						} else {
							System.out.println("\nNo puedes agregar tantas unidades a tu inventario");
							System.out.printf("El maximo de total es de %d unidades\n", maximoValor);
						}
					} else {
						inventarioTotal.put(objetoElegido, cantidadCompradaUsada);
						System.out.printf("Has agregado %d a tu inventario de %s\n\n", cantidadCompradaUsada, objetoElegido);
						}

					break;

				case 4:
					salir = true;
					break;

				case 13:
					System.out.println("Estudia y trabaja...");
					break;

				default:
					System.out.println("---REALMENTE--- pienso que has tecleado un numero erroneo a proposito");
					break;
				}

			} else {
				System.out.println("¿Estas tecleando con los codos? ¿quieres hacer el favor de introducir un solo numero de opcion?\n");
			}
		} while (!salir);
		sc.close();

		System.out.println("\nhAvE a Nice DAy!!!!");
	}
}
