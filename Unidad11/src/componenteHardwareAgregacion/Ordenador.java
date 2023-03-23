package componenteHardwareAgregacion;

public class Ordenador {

	private String almacenamiento; //Disco Duro
	private String tarjetaGrafica; //Watios
	private int RAM=16;
	private String so= "Windows 11";
	private miCPU cpu;
	private miPantalla pantalla;
	private miRaton mouse;
	private miTeclado keyboard;
	
	/**
	 * @param almacenamiento
	 * @param tarjetaGrafica
	 * @param ram
	 * @param so
	 * @param cpu
	 * @param pantalla
	 * @param mouse
	 * @param keyboard
	 */
	public Ordenador(String almacenamiento, String tarjetaGrafica, int RAM, String so, miCPU cpu, miPantalla pantalla,
			miRaton mouse, miTeclado keyboard) {
		this.almacenamiento = almacenamiento;
		this.tarjetaGrafica = tarjetaGrafica;
		this.RAM = RAM;
		this.so = so;
		this.cpu = cpu;
		this.pantalla = pantalla;
		this.mouse = mouse;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Ordenador [almacenamiento=" + almacenamiento + ", tarjetaGrafica=" + tarjetaGrafica + ", RAM=" + RAM
				+ ", so=" + so + ",\n cpu=" + cpu + ",\n pantalla=" + pantalla + ",\n mouse=" + mouse + ",\n keyboard="
				+ keyboard + "]";
	}	
}
