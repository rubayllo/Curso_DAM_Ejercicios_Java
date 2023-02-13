/**
 * Esta clase define planetas por nombre y gravedad. 
 * Contiene métodos para poder calcular el peso de 
 * un objeto, su masa, la altura desde la que cae o 
 * el tiempo que tarda en llegar al suelo al dejarlo 
 * caer desde una altura determinada en cada planeta
 * definido según se necesite
 * 
 * @author Ruben Ayllon Martinez
 * @version 01/02/2023
 */

public class DebateRuben {

	String planeta;
	double gravedad;
	double temperaturaMin;
	double temperaturaMax;

	DebateRuben(String planeta, double gravedad, double temperaturaMin, double temperaturaMax) {
		this.planeta = planeta;
		this.gravedad = gravedad;
		this.temperaturaMin = temperaturaMin;
		this.temperaturaMax = temperaturaMax;
	}

	/**
	 * @return el planeta
	 */
	public String getPlaneta() {
		return planeta;
	}

	/**
	 * @param nuevo planeta a establecer
	 */
	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	/**
	 * @return la gravedad
	 */
	public double getGravedad() {
		return gravedad;
	}

	/**
	 * @param nueva gravedad a establecer
	 */
	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}


	/**
	 * @return la temperatura minima
	 */
	public double getTemperaturaMin() {
		return temperaturaMin;
	}

	/**
	 * @param temperatura minima a establecer
	 */
	public void setTemperaturaMin(double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}

	/**
	 * @return la temperatura maxima
	 */
	public double getTemperaturaMax() {
		return temperaturaMax;
	}

	/**
	 * @param temperatura maxima a establecer
	 */
	public void setTemperaturaMax(double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}

	/**
	 * Calcula el tiempo que tarda un objeto en llegar al suelo cuando se deja caer 
	 * desde una altura determinada según gravedad del planeta: tiempo = raiz cuadrada de ( (2*a) / g)
	 * @param h corresponde a la altura desde donde cae el objeto
	 */
	public double tiempoCaida(double h){
	// resultado es igual a la raiz cuadrada de la altura al cuadrado partido de la gravedad
		double tiempoCaida;
		tiempoCaida = Math.sqrt((2*h)/gravedad);
		return tiempoCaida;
	}	

	/**
	 * Calcula la altura desde donde se deja caer un objeto en un planeta determinado
	 * mediante el tiempo que tarda en caer al suelo: altura = 1/2 * gravedad * tiempo2
	 * @param a corresponde a la altura desde donde cae el objeto
	 */
	public double alturaCaida(double t){
	// resultado es igual a la raiz cuadrada de la altura al cuadrado partido de la gravedad
		double alturaCaida;
		alturaCaida =0.5 * gravedad * Math.pow(t, 2);
		return alturaCaida;
	}		

	/**
	 * Dado la masa de un objeto calcula el peso de un 
	 * objeto según gravedad del planeta: (peso = masa * gravedad)
	 * @param m corresponde a la masa del cuerpo
	 */
	public double peso(double m){
		// resultado es igual a la masa por la gravedad
		double peso;
		peso = m * gravedad;
		return peso;
	}

	/**
	 * Dado el peso de un objeto calcula la masa de un 
	 * objeto según gravedad del planeta: (masa = peso / gravedad)
	 * @param m corresponde a la masa del cuerpo
	 */
	public double masa(double p){
		// resultado es igual a la masa por la gravedad
		double masa;
		masa = p / gravedad;
		return masa;
	}	@Override

	
	public String toString() {
		return "En el planeta " + planeta + ", la gravedad es de " + gravedad + " m/s2";
	}
}
