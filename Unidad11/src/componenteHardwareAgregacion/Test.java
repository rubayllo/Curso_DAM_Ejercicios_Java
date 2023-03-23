package componenteHardwareAgregacion;

public class Test {

	public static void main(String[] args) {

		miCPU cpu = new miCPU("Ryzen 9 7950X",32, 4.5f, 16);
		miPantalla pantalla = new miPantalla("AOC Agon AG353UCG","HDR, DisplayHDR 1000, 4× USB 3.0, 2× DisplayPort, 1× HDMI, G-SYNC", 35,"3440 × 1440 px");
		miRaton mouse = new miRaton("Logitech MX Master 3","Láser", 4, 141f);
		miTeclado keyboard = new miTeclado("ASUS ROG Strix Scope RX","USB 2.0","Español",49);
		Ordenador ordenador = new Ordenador("1275 TB","RTX 4090 Trinity", 16,"Windows 11", cpu, pantalla, mouse, keyboard);

		System.out.println(ordenador);
	}
}
