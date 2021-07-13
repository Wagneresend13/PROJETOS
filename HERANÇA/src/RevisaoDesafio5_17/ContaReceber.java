package RevisaoDesafio5_17;

public class ContaReceber extends Conta{
	
	
	
	Cliente cliente;
	SituacaoConta situacaoconta;
	
	

	ContaReceber(){
		
	}
	
	ContaReceber(Cliente cliente , String descricao , double valor , String dataVencimento){
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
		
	}
	
	
	
	public void cancelar() {
		
		if(this.getValor() > 50000) {
			System.out.println(" Conta com valor maior que R$ 50.000");
		}else {
			super.cancelar();
		}
		
	}
	
	
	public void receber() {
		
		if(this.situacaoConta.equals(situacaoConta.PAGA)) {
			System.out.println(" Conta de " + this.getDescricao() + " J� se enconta PAGA");
		}else if (this.situacaoConta.equals(situacaoconta.CANCELADA)) {
			System.out.println(" Conta de " + this.getDescricao() + " J� se enconta CANCELADA");
		}else {
			System.out.println(" Recebendo conta " + this.getDescricao());
			this.situacaoConta = this.situacaoConta.PAGA;
		}
		
		
		
	}
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
