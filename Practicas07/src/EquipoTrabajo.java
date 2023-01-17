import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EquipoTrabajo {

	public static void main(String[] args) {
		
		Set<String> plantilla = Set.of("Miguel", "Ana", "Maria", "Manuel", "Laura", "Noelia", "Juan", "Carlos", "Vanesa", "Ricardo");
		int cuantos = 0;
		String nombre;
		StringBuilder nombreCorrecto = new StringBuilder(); // Utilizo StringBuilder para mejorar el cambio del String mas adelante
		LinkedHashSet<String> todos = new LinkedHashSet<>(plantilla);
		LinkedHashSet<String> equipo = new LinkedHashSet<>();
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tienes a los siguientes empleados disponibles en la plantilla: \n");
		System.out.println(todos);
		
		System.out.println();
		do { //Comprobamos que elegimos un numero dentro del rango
			System.out.printf("\n¿Cuantos necesitas para realizar el equipo del nuevo proyecto? (1-%d)\n", todos.size());
			
			if(sc.hasNextInt()) {
				cuantos = sc.nextInt();
				sc.nextLine();
			} else {
				System.out.println("Por favor introduce un numero");
				sc.nextLine();
			}
		} while (cuantos > todos.size() || cuantos<1);


		for (int i = 1; i <= cuantos; i++) { // Se da paso a la insercion de los empleados elegidos
			System.out.printf("Elige el numero %d: ", i); 
	
			nombre = sc.nextLine();
			nombreCorrecto.delete(0, nombreCorrecto.length()); //elimino los datos de nombreCorrecto para insertar un nuevo nombre
			nombreCorrecto.append(nombre.toUpperCase().charAt(0)); //Configuro la primera letra en mayuscula
			nombreCorrecto.append(nombre.substring(1, nombre.length()).toLowerCase()); //Configuro el resto del nombre en minusculas

			if(todos.contains(nombreCorrecto.toString())) { // Se comprueba que el empleado esta disponible
				equipo.add(nombreCorrecto.toString()); // Se inserta el empleado
			} else {
				System.out.println("Ese nombre no se encuentra disponible");
				i--;  //En caso de no existir se informa por pantalla y se resta una iteracion
			}
		}
		sc.close();
		todos.removeAll(equipo); //Elimino el grupo de los elegidos del conjunto de empleados sin tareas

		//Salida por pantalla
		System.out.println("\nTe quedan libres: " + todos);
		System.out.println("Tu equipo lo forman: " + equipo);
	}
}
