package ContaCorrente;

public class Cliente extends Conta implements ContaCorrenteInterface {
	
	
	String nome_Cliente;
	double valorTotal;
	
	
	Cliente(){
		
	}
	
	Cliente (String nome_Cliente , double valorTotal){
		this.nome_Cliente = nome_Cliente;
		this.valorTotal = valorTotal;
	}
	
	
	
	

	@Override
	public double depositarQuantia() {
		
		Double valorDepositado = this.valorTotal;
		return valorDepositado;
	}

	@Override
	public double sacarQuantia() {
		Double valorSacado = this.valorTotal - super.SaldoTotal;
		return valorSacado;
	}

	@Override
	public String obterSaldo() {
		
		return "Saldo : " + this.valorTotal;
	}

}
