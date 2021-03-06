package RevisaoDesafio5_17;

public class ContaPagar extends Conta{
	
	
	
	Fornecedor fornecedor;

	ContaPagar(){
		
	}
	
	
	
	public ContaPagar(Fornecedor fornecedor,String descricao , double valor , String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		super.setValor(valor);
		this.setDataVencimento(dataVencimento);
		
	}
	

	public void pagar() {
		
		if(situacaoConta.equals(situacaoConta.PAGA)){
			System.out.println(" N?o pode pagar uma conta que ja esta paga");
		}else if(situacaoConta.equals(situacaoConta.CANCELADA)) {
			System.out.println(" N?o pode pagar uma conta que j? esta cancelada");
		}else {
			
			System.out.println(" Pagando conta " + this.getDescricao() + " No valor de  "
					+ this.getValor() + " e vencimento  em  :  " + this.getDataVencimento() 
					+ " do fornecedor " + this.fornecedor.getNome());
			this.situacaoConta = situacaoConta.PAGA;
		}
		
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
}
