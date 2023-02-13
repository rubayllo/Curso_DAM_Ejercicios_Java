public class CuentaBancaria {

	String numero;
	String titular;
	float saldo;
	float interesAnual;
	
	CuentaBancaria(String numero, String titular, float saldo, float interesAnual) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}

	void ingreso(float cantidad) {
		saldo += cantidad;
	}

	void reintegro(float cantidad) {
		saldo -= cantidad;
	}

	void ingresoInteresMes() {
		saldo += saldo * interesAnual;
	}

	boolean enRojos() {
		return saldo < 0;
	}

	float leerSaldo() {
		return saldo;
	}

}

