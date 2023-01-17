import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		int[] kmEtapa;
		int kmTotal = 0;
		kmEtapa = new int[5];
				
		Scanner sc = new Scanner(System.in);

//		s1 = s1.replaceAll("\\s", "");



		for (int i = 0; i < kmEtapa.length; i++) {
			System.out.print("Etapa " + (i + 1) + ": ");

			if (sc.hasNextInt() && sc.findInLine(" ")== null) {
				System.out.println("PERFECT");
				int km = sc.nextInt();
				if (km > 0 && km <= 50) {
					kmEtapa[i] = km;
					kmTotal = kmTotal + km;
					sc.reset();
					sc = new Scanner(System.in);
				} else {
					System.out.println("\nError\n");
					sc.reset();
					sc = new Scanner(System.in);
					i--;
				}

			} else {
				System.out.println("Error 2.\n");
				sc.nextLine();
				sc = new Scanner(System.in);
				i--;
			}
		}

		System.out.println(Arrays.toString(kmEtapa));

		sc.close();
	}
}










