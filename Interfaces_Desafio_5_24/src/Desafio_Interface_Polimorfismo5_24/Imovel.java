package Desafio_Interface_Polimorfismo5_24;

public class Imovel implements Seguravel{

	
	private double valorMercado;
	private int areaConstruida;
	
	
	Imovel(){
	
	}
	
	Imovel(double valorMercado, int areaConstruida){
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;

	}

	@Override
	public double calcularValorApolice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String obterDescricao() {
		
		String resultado = " Imovel com area construida" + this.areaConstruida + " m2 e o valor de mercado" + this.valorMercado;
		
		return resultado;
	}
	
	
}
