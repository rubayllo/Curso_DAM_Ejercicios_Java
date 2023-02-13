/**
 * 
 * Realiza una clase "Primo" (se debe llamar así), de la siguiente manera:
 * • La clase debe tener 1 atributo (un entero llamado num que indica 
 * el numero a calcular si es primo).
 * 
 * • Crea un constructor para dar un valor inicial a dicho atributo.
 * 
 * • Además, tendrá los siguientes métodos: 
 * 		o Un método setter que permite cambiar el valor del número void setValue(int n) 
 * 		o Un método getter que permite consultar el valor del número int getValue() 
 * 		o Un método que permite consultar si es primo o no el número boolean esPrimo()
 * 
 * @author Ruben Ayllon Martinez
 * @version 06/02/2023
 */


public class Primo {

	int num;

	Primo(int num) {
		this.num = num;
	}
	
	/**
	 * @param n es el numero que actualiza la variable "num"
	 */
	void setValue(int n) {
		num = n;		
	}
	
	/**
	 * @return el numero "num"
	 */
	int getValue() {
		return num;
	}

	/**
	 * @return si el numero "num" introducido es primo 
	 */
	boolean esPrimo() {
		  if (num == 0 || num == 1) {
			    return false;
			  }
		  for (int i = 2; i <= num / 2; i++) {
			    if (num % i == 0)
			      return false;
			  }
			  return true;
	}
}
