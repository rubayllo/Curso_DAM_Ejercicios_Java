
/**
 * Clase que define un coche de la fabrica de BMW y sus atributos: Modelo,
 * velocidad, deposito, consumo, kilometros.
 * Con estos atributos podremos realizar ciertos calculos y comprobaciones como
 * si puede acelerar, frenar, arrancar, parar o repostar y estado del motor (marcha o parado).  
 * Tambien se puede determinar el estado del deposito mediante su consumo 
 * por carretera derivado del kilometraje que se haya desplazado.
 * 
 * @author rubenayllonmartinez
 * @version Actividad 10 Ejercicio 2
 */
public class Coche {

	private String modelo;
	private int velocidad;
	private float deposito; // Cantidad real de combustible
	private final float capMaxCombustible;	// Capacidad total del deposito de combustible
	private float consumo; 
	private int kilometros;
	private boolean estaArrancado;
	private static int numeroCoches;
	
	/**
	 * Constructor de la clase Coche
	 * 
	 * @param modelo
	 * @param velocidad
	 * @param deposito
	 * @param consumo
	 * @param kilometros
	 */
	Coche(String modelo, float consumo, float capMaxCombustible, float deposito) {
		this.modelo = modelo;
		velocidad = 0;
		this.capMaxCombustible = capMaxCombustible;
		this.deposito = deposito;
		this.consumo = consumo;
		kilometros = 0;
		estaArrancado = false;
		numeroCoches++; //sumatorio del atributo por cada objeto creado
	}
	
	
	/**
	 * Getter del atributo "int = numeroCoches" 
	 * @return El número total de objetos Coche() que hemos creado
	 */
	public static int getNumeroCoches() {
		return numeroCoches;
	}

	
	/**
	 * @return el modelo
	 */
	public String getModelo() {
		return modelo;
	}


	/**
	 * @return la velocidad
	 */
	public float getVelocidad() {
		return velocidad;
	}


	/**
	 * @return el deposito
	 */
	public float getDeposito() {
		return deposito;
	}


	/**
	 * @return los kilometros totales recorridos
	 */
	public int getKilometros() {
		return kilometros;
	}


	/**
	 * @return el estado del coche arrancado(true) o parado(false)
	 */
	public boolean isEstaArrancado() {
		return estaArrancado;
	}


	/**
	 * Metodo para determinar si el coche puede acelerar o no mediante un test
	 * que valora si el motor esta en marcha o si supera la velocidad maxima
	 * de 120km/h entre otros registros que he decidido incluir.
	 * 
	 * @param velocidad
	 * @return
	 */
	public void acelerar(String velocidadEntrada) {
		int aceleracion; 
		if (soloNumerosEnteros(velocidadEntrada)) {
			aceleracion = Integer.parseInt(velocidadEntrada.trim());
			if (estaArrancado) {
				if (aceleracion > 0 && (this.velocidad + aceleracion) <= 120) {
					System.out.printf("Se acelera de %d hasta %d\n", this.velocidad, this.velocidad += aceleracion);
				} else if ((this.velocidad + aceleracion) > 120) {
					System.out.println("Error: No es posible ir a " + (aceleracion) );
				} else if (aceleracion == 0) {
					System.out.println("Error: no se ha producido ningún cambio de velocidad");
				}
			} else {
				System.out.println("Error: Debe arrancar antes de acelerar");
			}
		} else {
			System.out.println("Error Fatal: Introduce un valor numerico entero positivo de maximo 4 cifras");
		}
	}

			
	/**
	 * Metodo para determinar si el coche puede frenar o no mediante un test
	 * que valora si el motor esta en marcha o si rebaja la velocidad minima
	 * de 0km/h entre otros registros que he decidido incluir.
	 * 
	 * @param velocidad
	 * @return
	 */
	public void frenar(String velocidadEntrada) {
		int deceleracion; 
		if (soloNumerosEnteros(velocidadEntrada)) {
			deceleracion = Integer.parseInt(velocidadEntrada.trim());
		if (estaArrancado) {
			if (deceleracion > 0 && (this.velocidad - deceleracion) >= 0) {
				System.out.printf("Se frena de %d hasta %d\n", this.velocidad, this.velocidad -= deceleracion );
			} else if ((this.velocidad - deceleracion) < 0) {
				System.out.println("Error: No es posible frenar por debajo de 0");
			} else if (this.velocidad == deceleracion) {
				System.out.println("Error: no se ha producido ningún cambio de velocidad");
			}
		} else {
			System.out.println("Error: Debe arrancar antes de frenar");
		}
	} else {
		System.out.println("Error Fatal: Introduce un valor numerico entero positivo de máximo 4 cifras");
	}
}	

	
	/**
	 * Metodo para determinar el kilometraje que ha viajado y el consumo obtenido.
	 * Entre otros tambien determina si tiene suficiente gasolina en el deposito
	 * para realizar el desplazamiento entre otros test como verificar si esta el 
	 * motor en marcha o no.
	 * 
	 * @param kilometros
	 * @return
	 */
	public void conducir(String kilometros) {
		if (soloNumerosEnteros(kilometros)) {
			int recorrido = Integer.parseInt(kilometros.trim());
			float consumido = (recorrido * consumo) / 100;
			if (estaArrancado && this.velocidad > 0) {
				if ((deposito - consumido) >= 0) {
					this.kilometros += recorrido;
					System.out.printf("Se conducen %d kilometros\n-> El depósito pasa de %.2f hasta %.2f \n",
							recorrido, deposito, (this.deposito -= consumido));
				} else {
					System.out.println("Error: No tiene suficiente gasolina");
				}
			} else {
				System.out.println("Error: Para conducir el coche debe estar arrancado y con velocidad superior a 0");
			}
		} else {
			System.out.println("Error Fatal: Introduce un valor numerico entero positivo de máximo 4 cifras");
		}
	}
	
	/**
	 * Metodo para determinar la gasolina se intenta echar.
	 * 
	 * @param repostaje: cantidad de gasolina que se intenta echar
	 * 
	 */
	public void repostar(String repostaje) {
		if (soloNumerosFloat(repostaje)) {
			float repostar = Float.parseFloat(repostaje.trim());
			if (!estaArrancado) {
				if (repostar > 0 && capMaxCombustible >= (repostar + this.deposito)) {
					System.out.printf("Se reposta de %.2f hasta %.2f\n", this.deposito, (this.deposito += repostar));	
				} else if (repostar == 0) {
					System.out.println("Error: No ha repostado nada");		
				} else if (capMaxCombustible < (repostar + this.deposito)) {
					System.out.println("Error: El respostaje supera la capacida máxima del deposito");		
				}
			} else {
				System.out.println("Error: Debe parar antes de repostar");
			}
		} else {
			System.out.println("Error Fatal: Introduce un valor numerico positivo de máximo 6 cifras (4 enteros y 2 decimales)");
		}
	}

	
	
	/**
	 * Metodo para determinar si se puede arrancar el coche o no.
	 */
	public void arrancar() {
		if ( !estaArrancado ) {
				estaArrancado = true;
				System.out.println("Se arranca el coche");
		} else {
			System.out.println("Error: El coche ya está arrancado");
		}
	}

	
	/**
	 * Metodo para determinar si se puede parar el coche o no.
	 */
	public void parar() {
		if ( estaArrancado && velocidad == 0 ) {
			estaArrancado = false;
			System.out.println("Se para el coche");
		} else if (velocidad > 0) {
			System.out.println("Error: Debe reducir hasta 0 antes de parar");
		} else {
			System.out.println("Error: El coche ya está parado");
		}
	}

	
	/**
	 * Sirve para verificar que la cadena de texto unicamente 
	 * tiene 1 cadena de <b>NU&acute;MEROS</b> float
	 * 
	 * @param texto : Entrada de texto que se quiere validar que solamente
	 * contenga <b>N&Uacute;MEROS</b>.
	 * @return True o False
	 */
	private static boolean soloNumerosFloat(String texto) {
		if( (texto.trim().replaceAll("[\s]", " ").split(" ").length) == 1) {
			if (texto.trim().matches("[0-9]{1,3}[.]{0,1}[0-9]{0,2}")) {
			return true;
			}
		}				
		return false;
	}
	
	
	/**
	 * Sirve para verificar que la cadena de texto unicamente 
	 * tiene 1 cadena de <b>NU&acute;MEROS</b> enteros
	 * 
	 * @param texto : Entrada de texto que se quiere validar que solamente
	 * contenga <b>N&Uacute;MEROS</b>.
	 * @return True o False
	 */
	private static boolean soloNumerosEnteros(String texto) {
		if( (texto.trim().replaceAll("[\s]", " ").split(" ").length) == 1) {
			if (texto.trim().matches("[0-9]{1,4}")) {
			return true;
			}
		}				
		return false;
	}
	
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", velocidad=" + velocidad + ", deposito=" + deposito + ", consumo="
				+ consumo + ", kilometros=" + kilometros + ", estaArrancado=" + estaArrancado + "]";
	}
	
}
