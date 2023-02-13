import java.util.Scanner;

public class DebateRubenMain {

	public static void main(String[] args) {

		String entraDatos;
		double peso = 0;
		double altura = 0;
		boolean ok = false;
		
		Scanner sc = new Scanner(System.in);
		
		DebateRuben Mercurio = new DebateRuben("Mercurio", 3.7, -185, 430);
		DebateRuben Venus = new DebateRuben("Venus", 8.87, -45, 500);
		DebateRuben Tierra = new DebateRuben("Tierra", 9.8, -90, 55);
		DebateRuben Marte = new DebateRuben("Marte", 3.71, -140, 20);
		DebateRuben Júpiter = new DebateRuben("Júpiter", 24.79, -165, 120);
		DebateRuben Saturno = new DebateRuben("Saturno", 10.74, -190, -130);
		DebateRuben Urano = new DebateRuben("Urano", 8.87, -215, -195);
		DebateRuben Neptuno = new DebateRuben("Neptuno", 11.15, -223, -217);
		
		do { // Obtiene y comprueba los datos introducidos para la peso 
			System.out.println("Peso de tu objeto en kilogramos (Máx 9999.99 - Mín 0.01) solo admite 2 decimales");
			entraDatos = sc.nextLine().trim().replaceAll("[\s\t]", " ");
			if (entraDatos.matches("[0-9]{1,4}[.]{0,1}[0-9]{0,2}") && entraDatos.split(" ").length == 1) {
				if (Double.parseDouble(entraDatos) < 10000 && Double.parseDouble(entraDatos) > 0.01) {
					peso = Double.parseDouble(entraDatos);
					System.out.println("ok\n");
					ok = true;
				} else {
					System.out.println("Introduce un número real\n");					
				}
			} else {
				System.out.println("Introduce un número real\n");
			}
		} while (!ok);
		ok = false;

		do { // Obtiene y comprueba los datos introducidos para la altura 
			System.out.println("Altura desde donde lo dejas caer en metros (Máx 9999.99 - Mín 0.01) solo admite 2 decimales");
			entraDatos = sc.nextLine().trim().replaceAll("[\s\t]", " ");
			if (entraDatos.matches("[0-9]{1,4}[.]{0,1}[0-9]{0,2}") && entraDatos.split(" ").length == 1) {
				if (Double.parseDouble(entraDatos) < 10000 && Double.parseDouble(entraDatos) > 0.01) {
					altura = Double.parseDouble(entraDatos);
					System.out.println("ok\n");
					ok = true;
				} else {
					System.out.println("Introduce un número real\n");					
				}
			} else {
				System.out.println("Introduce un número real\n");
			}
		} while (!ok);
		ok = false;
		sc.close();

		/*
		 * Saca por pantalla los datos genericos de cada planeta y el resultado obtenido
		 * de calcular la masa y el tiempo en llegar al suelo del objeto
		 */
		System.out.println(Mercurio + "\n\tla masa del objeto es de " + Mercurio.masa(peso)
				+ " kg\n\t y tardará en llegar al suelo " + Mercurio.tiempoCaida(altura) + " m/s2");
		
		System.out.println(Venus + "\n\tla masa del objeto es de " + Venus.masa(peso)
		+ " kg\n\ty tardará en llegar al suelo " + Venus.tiempoCaida(altura) + " m/s2");
		
		System.out.println(Tierra + "\n\tla masa del objeto es de " + Tierra.masa(peso)
		+ " kg\n\ty tardará en llegar al suelo " + Tierra.tiempoCaida(altura) + " m/s2");
		
		System.out.println(Marte + "\n\tla masa del objeto es de " + Marte.masa(peso)
		+ " kg\n\ty tardará en llegar al suelo " + Marte.tiempoCaida(altura) + " m/s2");
		
		System.out.println(Júpiter + "\n\tla masa del objeto es de " + Júpiter.masa(peso)
		+ " kg\n\ty tardará en llegar al suelo " + Júpiter.tiempoCaida(altura) + " m/s2");
		
		System.out.println(Saturno + "\n\tla masa del objeto es de " + Saturno.masa(peso)
		+ " kg\n\ty tardará en llegar al suelo " + Saturno.tiempoCaida(altura) + " m/s2");
		
		System.out.println(Urano + "\n\tla masa del objeto es de " + Urano.masa(peso)
		+ " kg\n\ty tardará en llegar al suelo " + Urano.tiempoCaida(altura) + " m/s2");
		
		System.out.println(Neptuno + "\n\tla masa del objeto es de " + Neptuno.masa(peso)
		+ " kg\n\ty tardará en llegar al suelo " + Neptuno.tiempoCaida(altura) + " m/s2");
	}
}
