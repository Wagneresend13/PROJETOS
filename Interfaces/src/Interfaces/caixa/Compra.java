 package Interfaces.caixa;

import Interfaces.impressao.Imprimivel;
import Interfaces.pagamento.Autorizavel;


public class Compra implements Autorizavel , Imprimivel{

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
	@Override
	public double getValorTotal() {
		
		return this.valorTotal;
	}
	
	
	
	public String getProduto() {
		return produto;
	}




	public void setProduto(String produto) {
		this.produto = produto;
	}




	public String getNomeCliente() {
		return nomeCliente;
	}




	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}




	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	@Override
	public String getCabecaPagina() {
		// TODO Auto-generated method stub
		return this.getProduto() + " = " + this.getValorTotal();
	}



	@Override
	public String getCorpoPagina() {
		// TODO Auto-generated method stub
		return this.getNomeCliente();
	}
	
	

}
