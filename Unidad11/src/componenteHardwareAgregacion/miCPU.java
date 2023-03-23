package componenteHardwareAgregacion;

public class miCPU {

	private String procesador; //Intel vs AMD
	private int numeroHilos; //Watios
	private float frecuencia;
	private int nucleos;

	/**
	 * @param procesador
	 * @param numeroHilos
	 * @param frecuencia
	 * @param nucleos
	 */
	public miCPU(String procesador, int numeroHilos, float frecuencia, int nucleos) {
		this.procesador = procesador;
		this.numeroHilos = numeroHilos;
		this.frecuencia = frecuencia;
		this.nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "miCPU [procesador=" + procesador + ", numeroHilos=" + numeroHilos + ", frecuencia=" + frecuencia
				+ ", nucleos=" + nucleos + "]";
	}

}
