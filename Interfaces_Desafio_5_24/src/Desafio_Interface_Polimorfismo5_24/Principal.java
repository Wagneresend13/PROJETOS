package Desafio_Interface_Polimorfismo5_24;

public class Principal {

	
	public static void main(String[] args) {
		
		CorretoraSeguros corretora = new CorretoraSeguros();
		Carro meuCarro = new Carro(4500d , 2012);
		Imovel minhaCasa = new Imovel(920000,  320);
		
		corretora.fazerPropostaSegura(minhaCasa);
		corretora.fazerPropostaSegura(meuCarro);
		
		
		
	}
}
