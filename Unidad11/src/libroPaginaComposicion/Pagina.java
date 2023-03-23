package libroPaginaComposicion;

public class Pagina {

	private String contenido;
	private int numero;
	
	/**
	 * @param contenido
	 * @param numero
	 */
	public Pagina(String contenido, int numero) {
		this.contenido = contenido;
		this.numero = numero;
	}

	/**
	 * @return el contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @return el numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param contenido el contenido a establecer
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @param numero el numero a establecer
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "\nPagina " + numero + " - " + contenido;
	}

	
}
