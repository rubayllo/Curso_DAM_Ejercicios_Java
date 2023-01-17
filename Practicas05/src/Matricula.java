import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {
		final int NUM_DIGS=4;            // defino como constantes el nº de dígitos y letras que tiene una matrícula
		final int NUM_LETRAS=3;
		final char MIN_CHAR='B';         // defino el rango válido y los valores inválidos dentro de él
		final char MAX_CHAR='Z';
		final String NO_VALID="AEIOU";   
		
		int num=0;				// el nº que mete el usuario
		String letras="";		// las letras
		
		boolean noValido=true;		// flag para controlar validez de la entrada del usuario
		boolean masLetras=true;		// flag para indicar que hay que cambiar más letras
		
		int letraPos=NUM_LETRAS-1;  // lo usaré para moverme en las letras, empezando en la última
		
		Scanner scn=new Scanner(System.in);

		do {                                                            // entrada del usuario y validación
			System.out.print("Introduzca la matrícula (NNNN XXX): ");
			if(scn.hasNextInt()) {    // no fuerzo a que lo meta en una línea, si no usaría nextLine()
				//num=scn.nextInt();  // Usaría esto si le permito meter el nº con un solo dígito, sin 0's
				num=-1;
				letras=scn.next();
				if(letras.length()==NUM_DIGS)       // si no, se queda con -1
				   num=Integer.parseInt(letras);    // ya sé que es entero
				letras=scn.next().toUpperCase();	// cojo las letras, no miro si hay algo más detrás
				if(num>=0 && num<Math.pow(10,NUM_DIGS) & letras.length()==NUM_LETRAS) {  // compruebo rangos/tamaño 
					noValido=false;
				}
				for(int i=0;i<letras.length();i++) {  // compruebo que las letras estén en rango y no sean vocales
					char cadaLetra=letras.charAt(i);
					if(NO_VALID.contains(""+cadaLetra) || cadaLetra<MIN_CHAR || cadaLetra>MAX_CHAR) 
						noValido=true;
				}
			}				
			
			if(noValido) {
				System.out.println("  Formato no válido!!");
				scn.nextLine();
			}	
		} while(noValido);
		scn.close();
		
		StringBuilder letrasSB=new StringBuilder(letras);   // metemos en StringBuilder para poder hacer cambios
		
		if(num==Math.pow(10,NUM_DIGS)-1) {  // es 9999, hay que cambiar letras
			num=0;
			
			while(masLetras && letraPos>=0)
			{
				if(letrasSB.charAt(letraPos)==MAX_CHAR) {
					letrasSB.setCharAt(letraPos,MIN_CHAR);
					letraPos--;
			    }	
				else {
					letrasSB.setCharAt(letraPos,((char)(1+letrasSB.charAt(letraPos))));		 // incrementamos en 1
					if(NO_VALID.contains(""+letrasSB.charAt(letraPos)))                      // si es inválida pasamos a la siguiente, 
						letrasSB.setCharAt(letraPos,((char)(1+letrasSB.charAt(letraPos))));  // podríamos hacer un while si pudiera haber letras inválidas seguidas
					masLetras=false;
				}					
			}
		}
		else
			num++;     // sólo hay que cambiar el nº
		
		if(letraPos<0)
			System.out.println("Damos la vuelta al contador....");
		
		System.out.printf("La siguiente matrícula será : %04d %s\n",num,letrasSB);
	}

}
