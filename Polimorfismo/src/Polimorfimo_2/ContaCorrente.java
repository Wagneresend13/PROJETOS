package Polimorfimo_2;

public class ContaCorrente extends Conta {
	
	private Double limite;

	ContaCorrente(){
		
	}

	public Double getLimite() {
		return limite;
	}
	
	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public void exibirValores() {
		
		System.out.println("Valores da Conta Corrente :" + this.getLimite());
		
	}

	
	
	
	
	

}
