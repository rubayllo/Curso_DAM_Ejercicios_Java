
import java.util.Scanner;

public class Mensaje {

	public static void main(String[] args) {
	   final int LONG=2;
	   final char MIN_CHAR='A';             // rango de caracteres válidos
	   final char MAX_CHAR='Z';
	   final String VALID_CHARS=" ,.";      // caracteres válidos fuera del rango
       boolean noValido=true;               // flag de control de los bucles
       int pos=0;                           // para moverme por la entrada desde el principio
       char letra;                          // cada código que voy cogiendo
       
       String entrada;
       
       Scanner scn=new Scanner(System.in);

       do {
    	   System.out.print("Introduzca código: ");
    	   entrada=scn.nextLine();
    	   if(entrada.matches("[0-9]+") && entrada.length()%LONG==0) // solo números, en parejas
    		   noValido=false;    		   
    	   else
    		   System.out.println("Entrada incorrecta!");    	   
       } while(noValido);
       scn.close();
       
       while(pos<entrada.length()&&!noValido) {
    	   letra=(char)(Integer.parseInt(entrada.substring(pos, pos+LONG)));
    	   if((letra<MIN_CHAR|| letra>MAX_CHAR)&&!VALID_CHARS.contains(""+letra)) { // valores válidos	
    		   System.out.println("\nEncontrado carácter fuera de rango");
    		   noValido=true;
    	   }   
    	   else {
    		   System.out.print(letra);
    		   pos+=LONG;
    	   }
       }
       System.out.println();             

	}

}
