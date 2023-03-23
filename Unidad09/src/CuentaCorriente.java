/**
 * Realiza una clase " CuentaCorriente" (se debe llamar así), de la siguiente manera:
 * • La clase debe tener 1 atributo (un String llamado saldo. Es obligatorio que sea String). 
 * • Crea un constructor sin parámetros que ponga el saldo a “0”. 
 * • Además, tendrá los siguientes métodos: 
 * 		o Un método getter que permite consultar el saldo (puede ser negativo)  int getSaldo() 
 * 		o Un método que permite realizar imposiciones (ingresar dinero): void imposicion(int x) 
 * 		o Un método que permite realizar reintegros (sacar dinero): void reintegro(int x)
 * 
 * @author Ruben Ayllon Martinez
 * @version 06/02/2023
 */

public class CuentaCorriente {
	String saldo;
	
	CuentaCorriente(){
		saldo = "0";
	}
	
	/**
	 * @return el saldo disponible en la cuenta corriente
	 */
	int getSaldo() {
		return Integer.parseInt(saldo);
	}
	
	/**
	 * @param x es el saldo que se incrementa al saldo disponible
	 * en la cuenta corriente
	 */
	void imposicion(int x) {
		saldo = Integer.toString(x + Integer.parseInt(saldo));
	}
	
	/**
	 * @param x es el saldo que diminuye el saldo disponible 
	 * en la cuenta corriente
	 */
	void reintegro(int x) {
		saldo = Integer.toString(Integer.parseInt(saldo) - x);				
	}
}
