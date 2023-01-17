import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {

		// Entrada
		Scanner sc = new Scanner(System.in);
		System.out.print("Turno jugador 1: (1) Piedra, (2) Papel, (3) Tijera: ");
		int j1 = sc.nextInt();
		System.out.print("Turno jugador 1: (1) Piedra, (2) Papel, (3) Tijera: ");
		int j2 = sc.nextInt();
		
		if (j1 == j2) {
			System.out.println("Se ha producido un empate");			
		}
		else if ((j1 == 1 && j2 == 3) || (j1 == 2 && j2 == 1) || (j1 == 3 && j2 == 2)){
			System.out.println("Gana " + j1);
		}
		else if ((j2 == 1 && j1 == 3) || (j2 == 2 && j1 == 1) || (j2 == 3 && j1 == 2)){
			System.out.println("Gana " + j2);
		}
		
		sc.close();
	}

}
