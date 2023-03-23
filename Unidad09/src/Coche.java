/**
 * Realiza una clase "Coche" (se debe llamar así), de la siguiente manera: 
 * • La clase debe tener dos atributos: 
 * 		o ruedas, de tipo int 
 * 		o velocidad, de tipo int 
 * 
 * • Crea un constructor sin parámetros que ponga un 4 en las ruedas y un 0 en la velocidad. 
 * • Además, tendrá los siguientes métodos: 
 * 		o Métodos getter y setters para los dos atributos. 
 * 		o Un método que permita acelerar una determinada cantidad, siempre y cuando 
 * la velocidad resultante sea inferior a 120. En caso contrario se mantiene la actual. 
 * void acelerar (int cantidad) 
 *  	o Un método que permita frenar una determinada cantidad, siempre y cuando 
 * la velocidad resultante no sea inferior a 0. En caso contrario se mantiene 
 * la actual. void frenar (int cantidad) 
 * 		o El método toString() que sirva para mostrar todos los atributos del objeto.
 * 
 * @author Ruben Ayllon Martinez
 * @version 06/02/2023
 */

public class Coche {
	int ruedas;
	int velocidad;
	
	Coche() {
		ruedas = 4;
		velocidad = 0;
	}

	/**
	 * @return el numero de ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}

	/**
	 * @param cambia el numero ruedas
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * @return devuelve la velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param cambia la velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * @param cantidad es la velocidad que se incrementara de la velocidad inicial
	 * siempre que no exceda los 120 kilometros por hora
	 */
	void acelerar (int cantidad) {
		if(cantidad + velocidad <= 120) {
			velocidad += cantidad;
		}		
	}
	
	/**
	 * @param cantidad es la velocidad que se disminuye de la velocidad inicial
	 * siempre que no sea menor de 0 kilometros por hora puesto que ya no habria velocidad
	 */
	void frenar (int cantidad) {
		if(velocidad - cantidad >= 0) {
			velocidad -= cantidad;
		}
	}

	@Override
	public String toString() {
		return "Coche [ruedas=" + ruedas + ", velocidad=" + velocidad + "]";
	}
	
	
}
