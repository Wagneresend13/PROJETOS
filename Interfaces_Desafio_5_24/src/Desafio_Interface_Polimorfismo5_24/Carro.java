package Desafio_Interface_Polimorfismo5_24;

public class Carro implements Seguravel{
	
	private double valorMercado;
	private int anoFabricacao;
	
	Carro(){
		
	}
	
	Carro(double valorMercado , int anoFabricacao){
		this.valorMercado = valorMercado ;
		this.anoFabricacao = anoFabricacao;
		
	}
	
	

	@Override
	public double calcularValorApolice() {
		
		double valorApolice;
		valorApolice = this.valorMercado * 0.4;
		
		if(this.anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		
		String resultado = " Carro" + this.anoFabricacao + " com o valor do mercado" + this.valorMercado;
		
		
		return resultado;
	}

}
