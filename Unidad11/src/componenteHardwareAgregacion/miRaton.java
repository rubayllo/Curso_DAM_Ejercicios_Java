package componenteHardwareAgregacion;

public class miRaton {

	private String modelo; //Optico, laser, .... 
	private String sensor; //Inalambrica o cable
	private int numBotones=3;
	private float peso=130.0f;

	/**
	 * @param modelo
	 * @param sensor
	 * @param numBotones
	 * @param peso
	 */
	public miRaton(String modelo, String sensor, int numBotones, float peso) {
		this.modelo = modelo;
		this.sensor = sensor;
		this.numBotones = numBotones;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "miRaton [modelo=" + modelo + ", sensor=" + sensor + ", numBotones=" + numBotones + ", peso="
				+ peso + "]";
	}

	
}
