package Desafio5_7;

public class ContaPagar {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	
	private Fornecedor fornecedor;

	public ContaPagar() {
		
	}
	
	public ContaPagar(Fornecedor fornecedor,String descricao ,double valor , String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
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
	
	void pagar() {
		System.out.println("Pagando conta " + this.descricao + " no valor de " + this.valor + " com vencimento " 
				+ this.dataVencimento + " Do fornecedor  " + this.getFornecedor().getNome() + " . ");
	}
	

}
