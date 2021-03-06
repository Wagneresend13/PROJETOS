package Desafio5_13;

public class ContaPagar {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	Fornecedor fornecedor;
	SituacaoConta situacaoConta;
	
	public ContaPagar(){
		this.situacaoConta = situacaoConta.PENDENTE;
	}
	
	public ContaPagar(Fornecedor fornecedor,String descricao , double valor , String dataVencimento) {
		
		this();
		
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
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
	
	public void cancelar() {
		
		if(situacaoConta.equals(situacaoConta.CANCELADA)) {
			System.out.println(" N?o se pode cancelar uma conta j? com status cancelado");
		}else if(situacaoConta.equals(situacaoConta.PAGA)) {
			System.out.println(" N?o se pode cancelar uma conta ja com status PAGA");
		}else {
			System.out.println(" Cancelando conta " + this.getDescricao());
		this.situacaoConta = this.situacaoConta.CANCELADA;
		
		}
		
		
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
}
