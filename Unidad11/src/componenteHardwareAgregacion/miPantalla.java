package componenteHardwareAgregacion;

public class miPantalla {

	private String modelo;  
	private String entradasVideo;
	private int pulgadas= 32;
	private String resolucion="1.920 x 1.080";
	
	/**
	 * @param modelo
	 * @param entradasVideo
	 * @param pulgadas
	 * @param resolucion
	 */
	public miPantalla(String modelo, String entradasVideo, int pulgadas, String resolucion) {
		this.modelo = modelo;
		this.entradasVideo = entradasVideo;
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "miPantalla [modelo=" + modelo + ", entradasVideo=" + entradasVideo + ", pulgadas="
				+ pulgadas + ", resolucion=" + resolucion + "]";
	}

	
}
