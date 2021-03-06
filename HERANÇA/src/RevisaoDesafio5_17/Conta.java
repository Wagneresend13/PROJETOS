package RevisaoDesafio5_17;

public class Conta {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	Fornecedor fornecedor;
	SituacaoConta situacaoConta;
	
	
	
	
	public Conta(){
		this.situacaoConta = situacaoConta.PENDENTE;
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

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
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


	

}
