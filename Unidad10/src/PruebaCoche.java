
public class PruebaCoche {

	public static void main(String[] args) {
 
		Coche coche1 = new Coche("BMW M4 Cabrio",  10.2f, 60f, 40f);
		Coche coche2 = new Coche("BMW M135i xDrive", 7.4f, 70f, 30f);
		
//Coche1
		// Arranca el coche		
		coche1.arrancar();
		// Acelera hasta 120 km/h
		coche1.acelerar("   120  			");
		// Conduce 200 km
		coche1.conducir("    200");
		// Frena hasta 90
		coche1.frenar("30       \n");
		// Conduce 100 km
		coche1.conducir("\n   \n100");
		// Frena hasta 0
		coche1.frenar("90");
		// Para el coche
		coche1.parar();
		// Reposta 50,5 l
		coche1.repostar("     50.5     ");
		// Mostrar todos los atributos del coche
		System.out.println(coche1.toString());

		System.out.println("----------------------------------");
		
// Coche2 
		// Se intenta parar (error)
		coche2.parar();
		// Se intenta acelerar hasta 100 km/h (error)
		coche2.acelerar("100");
		// Se intenta frenar hasta 50 km/h (error)
		coche2.frenar("50");
		// Se intenta conducir 20 km (error)
		coche2.conducir("20");
		// Se arranca
		coche2.arrancar();
		// Se intenta repostar 10l (error)
		coche2.repostar("10");
		// Se acelerar hasta 150 km/h (error)
		coche2.acelerar("150");
		// Se acelerar hasta 100 km/h
		coche2.acelerar("100");
		// Se intenta parar (error)
		coche2.parar();
		// Se intenta conducir 1000 km (error)
		coche2.conducir("1000");
		// Conduce 150 km
		coche2.conducir("150");
		// Frena hasta -50 km/h (error)
		coche2.frenar("150");
		// Frena hasta 0
		coche2.frenar("    100    ");
		// Parar el coche
		coche2.parar();
		// Parar el coche (error)
		coche2.parar();
		// Reposta 22,8 l
		coche2.repostar("     22.8     ");
		// Mostrar todos los atributos del coche		
		System.out.println(coche2.toString());

		
		System.out.println("----------------------------------");
		
		System.out.println("Total coches: " + Coche.getNumeroCoches());
	}

}
