package Polimorfimo_2;

public abstract class Conta {
	
	protected Double saldo;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void exibirValores();
	

	
	
	
}
