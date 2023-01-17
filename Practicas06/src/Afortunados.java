/*********************************************************************
 * Autor: JAA
 * Fecha 
 * versión
 * Este programa...
 * 
 **********************************************************************/
import java.util.LinkedList;
import java.util.Scanner;

public class Afortunados {

	public static void main(String[] args) {
		   final int MIN=2;						// rango válido
		   final int MAX=100000;
		   final int START=2;					// cada cuantos borra al principio
		   
	       boolean invalido=true;               // flag de control de los bucles
	       int num=0;                           // recoge valor de usuario
	       int cada=START;                      // cada cuantos borra en cada ciclo
	       int posBorra;						// para marcar la posición del elemento a borrar

	       LinkedList<Integer> miLista=new LinkedList<>();  // para manejar la lista de números
	       
	       
	       Scanner scn=new Scanner(System.in);

	       do {
	    	   System.out.print("Introduzca nº elementos: ");
	    	   if(scn.hasNextInt()) {
	    		   num=scn.nextInt();
	    		   if(num>=MIN && num<=MAX)				  // valido el rango
	    		     invalido=false;
	    		   else
	    			   System.out.printf("  Rango %d - %d!\n",MIN,MAX);
	    	   }
	    	   else
    			   System.out.printf("  Un número entero!\n");	    		   
	    	   scn.nextLine();
	       } while(invalido);
	       scn.close();
	       
	       for(int i=1;i<=num;i++)				// relleno la lista
	    	   miLista.add(i);

	       while(miLista.size()>=cada) {		// acaba cuando el tamaño es menor que cada (M)
		       posBorra=0;
		       while(miLista.size()>posBorra) {
		    	   miLista.remove(posBorra);    // borramos el de la posición 
		       	   posBorra+=cada-1;			// movemos posición al siguiente, teniendo en cuenta que hemos borrado uno de la izquierda
			   }
			   cada++;		    	   
	       }
	       
	       System.out.printf("%d: ",num);       // imprimo resultado
	       for(int i=miLista.size()-1;i>=0;i--)
	    	   System.out.print(miLista.get(i)+" ");
	       System.out.println();

	}

}
