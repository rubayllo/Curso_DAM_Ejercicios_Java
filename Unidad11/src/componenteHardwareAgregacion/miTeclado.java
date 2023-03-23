package componenteHardwareAgregacion;

public class miTeclado {

	private String modelo;
	private String conexion; //Inalambrica o cable
	private String idioma = "Español";
	private int numTeclas=49;
	
	/**
	 * @param modelo
	 * @param conexion
	 * @param idioma
	 * @param numTeclas
	 */
	public miTeclado(String modelo, String conexion, String idioma, int numTeclas) {
		this.modelo = modelo;
		this.conexion = conexion;
		this.idioma = idioma;
		this.numTeclas = numTeclas;
	}

	@Override
	public String toString() {
		return "miTeclado [modelo=" + modelo + ", conexion=" + conexion + ", idioma=" + idioma + ", numTeclas="
				+ numTeclas + "]";
	}
}
