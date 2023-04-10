package ar.edu.unlam.pb1.trabajoPractico03;

public class Cuenta {
	private float saldo;

	public Cuenta(float saldoInicial) {
		this.saldo = saldoInicial;

	}

	public float retirar(float cantidad) {
		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
		}
		return saldo;
	}

	public float depositar(float cantidad) {
		saldo = saldo + cantidad;
		return saldo;
	}

	public float getSaldo() {
		return saldo;
	}

}
