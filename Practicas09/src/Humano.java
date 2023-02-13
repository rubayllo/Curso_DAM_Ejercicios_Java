
public class Humano {

	String nombre;
	int edad;
	float peso;
	float estatura;

	Humano(String nombre, int edad, float peso, float estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
	}

	void cumplirAnos() {
		edad++;
	}

	void cambiarPeso(float nuevoPeso) {
		peso = nuevoPeso;
	}

	void cambiarEstatura(float nuevaEstatura) {
		estatura = nuevaEstatura;
	}

	String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Humano [nombre = " + nombre + ", edad = " + edad + ", peso = " + peso + ", estatura = " + estatura + "]";
	}

}

