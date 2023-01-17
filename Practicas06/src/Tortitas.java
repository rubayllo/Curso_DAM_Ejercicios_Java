

import java.util.LinkedList;
import java.util.Scanner;

public class Tortitas {

	public static void main(String[] args) {
	  	   final int NUM_TORTITAS=10;

	  	   LinkedList<Integer> miLista=new LinkedList<>();  // la pila de tortitas inicial
	  	   LinkedList<Integer> enPaleta=new LinkedList<>(); // las que saco para darles la vuelta
		   String[] vueltas;								// resultado del split()
		   String entrada; 									// entrada del usuario
		   int num;
		   
		   for(int i=1;i<=NUM_TORTITAS;i++)
		      miLista.add(i);

		   System.out.print("Lista de tortitas a voltear: ");
	       Scanner scn=new Scanner(System.in);
	       entrada=scn.nextLine();								// cojo entrada, en 1 línea
	       scn.close();
	       
	       vueltas=entrada.split("[ ]+");  // parto la entrada separando con blancos (1 o más)
	       for(String valor:vueltas) {     // recorro los "tokens"
	    	   if (valor.matches("[0-9]+") && ((num=Integer.parseInt(valor))>=1)  && num <= NUM_TORTITAS) {  // compruebo valores correctos
	    		   for(int i=0;i<num;i++)                // saco las tortitas desde arriba
	    			   enPaleta.add(miLista.removeLast());
	    		   while(enPaleta.size()>0)                   // y las meto al revés
	    			   miLista.add(enPaleta.removeFirst());
	    	   }
	    	   else {
	    		   System.out.printf("Me salto \"%s\"\n", valor);  // esta entrada no la proceso
	    	   }	    		   
	       }
	       System.out.println(miLista.getLast());        // la que está arriba, la última.  o peekLast() o get(NUM_TORTITAS-1)
	}

}
