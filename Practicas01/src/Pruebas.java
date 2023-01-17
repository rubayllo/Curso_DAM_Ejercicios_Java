import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args)  {
		double x = 6.5;
		final double y = 7.8;
		 
		System.out.printf("%4.2f \n\n",x * y);
		
		String numeroTexto = "100";
		int masUno = (Integer.parseInt(numeroTexto)) + 1;
		System.out.println(masUno);
		
		System.out.println(45 / 10); // Resultado sin decimales puesto que son enteros y no se han declarado decimales
		System.out.println(45 % 10); // Resultado que muestra el resto de la division 

		Scanner entrada = new Scanner (System.in);

		System.out.print("Introduzca tu edad: ");
		int edad = entrada.nextInt();
		System.out.print("Introduzca tu peso: ");
		float peso = entrada.nextInt();

		System.out.printf("\n Con un año más tendrás %3d años y el doble de tu peso sería %4.2f kg", edad+1, peso*2);	

		entrada.close();
	}
}