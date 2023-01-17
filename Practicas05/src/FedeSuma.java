import java.util.Scanner;

public class FedeSuma {

	public static void main(String[] args) {

		final char MAX_NUM = '9';
		final char MAX_LET = 'F';
		final String DATOS_VALIDOS = "0123456789ABCDEF"; // Defino como const los datos que va poder ingresar el usuario

		int sumaEntero = 0; // Para poder aumemtar en 1 el número hexadecimal

		char caracter; // Voy a guardar el caracter de ese número ASCII (ya sumado)

		String entrada = ""; // var de entrada
		String sumaCaracter = ""; // Voy a concatenar los caracteres

		Boolean valido = true; // flag para controlar que ya aumente en 1 el número hexadecimal
		Boolean comprobador = true; // flag para controlar datos de entrada

		Scanner scn = new Scanner(System.in);

		do {
			System.out.print("Ingresa un número hexadecimal: ");
			entrada = scn.nextLine();
			for (int i = 0; i < entrada.length(); i++) {
				char cadaLetra = entrada.charAt(i); // Separo la cadena en caracteres 
				if (DATOS_VALIDOS.contains("" + cadaLetra)) { // Voy mirando que cada caracter contenga algunos de los datos validos de entrada
					comprobador = false; // Cambio el flag para salir del bucle
				} else {
					comprobador = true; // Vuelo a cambiar el flag en caso de que algun caracter no sea valido
					System.out.println("Datos invalidos");
					i = entrada.length(); // Fuerzo la salida del bucle
				}
			}
		} while (comprobador); 
		scn.close();

		StringBuilder cadena = new StringBuilder(entrada); // Creo StringBuilder para poder modificar la cadena 
		cadena = cadena.reverse(); // la doy vuelta para poder sumarla correctamente

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == MAX_NUM) { 

				if (valido) {

					sumaEntero = (int) cadena.charAt(i) + 8; // Hago un cast para poder sumar , sumo 8 para llegar al  numero ASCII de la A(65)
					caracter = (char) sumaEntero; // Hago un cast para en vez de tener el 65 , tener la A
					sumaCaracter += caracter; // Concateno el caracter
					valido = false; // Cambio el flag para ya no volver a aumentar el numero.
				} else {
					sumaEntero = (int) cadena.charAt(i); // Asigno el valor a sumaEntero
					caracter = (char) sumaEntero;    
					sumaCaracter += caracter;
				}
			} else if (cadena.charAt(i) == MAX_LET) {
				if (valido) {
					sumaEntero = (int) cadena.charAt(i) - 22;
					caracter = (char) sumaEntero;
					sumaCaracter += caracter;
					if (i == cadena.length() - 1) { // Si es el ultimo caracter y es F
						sumaCaracter = sumaCaracter + 1; // Le sumo 1
					}
				} else {
					sumaEntero = (int) cadena.charAt(i);
					caracter = (char) sumaEntero;
					sumaCaracter += caracter;
				}
			} else {
				if (valido) {
					sumaEntero = (int) cadena.charAt(i) + 1;
					caracter = (char) sumaEntero;
					sumaCaracter += caracter;
					valido = false;
				} else {
					sumaEntero = (int) cadena.charAt(i);
					caracter = (char) sumaEntero;
					sumaCaracter += caracter;
				}
			}
		}
		StringBuilder salida = new StringBuilder(sumaCaracter);
		salida = salida.reverse(); // Una ves sumados los doy vuelta para poder imprimir bien los números
		System.out.println(salida);
	}
}