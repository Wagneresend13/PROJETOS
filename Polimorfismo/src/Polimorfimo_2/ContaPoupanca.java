package Polimorfimo_2;

public class ContaPoupanca extends Conta{
	
	private Double rendimento;
	
	
	ContaPoupanca(){
		
	}
	
	ContaPoupanca(Double rendimento){
		this.rendimento = rendimento;
		
	}

	public Double getRendimento() {
		return rendimento;
	}

	@Override
	public void exibirValores() {
		System.out.println(" Valores Conta Poupança :  " + this.getRendimento());
		
	}
	

}
