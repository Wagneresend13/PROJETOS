package Desafio_Interface_Polimorfismo5_24;

public class CorretoraSeguros {


	
	public void fazerPropostaSegura(Seguravel objetoseguravel) {
		
		System.out.println("Corretora de Seguro - PROPOSTA");
		System.out.println(objetoseguravel.obterDescricao());
		System.out.println(" Valor da apolice "  + objetoseguravel.calcularValorApolice());
		System.out.println();
		
		
	}
	
	
}
