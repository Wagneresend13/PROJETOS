package Desafio5_22_polimorfismo_classes_abstratas;

public class RelatorioContas   {

	
	
	public void relatorioContas(Conta [] conta) {
		
		
		for(int i = 0; i < conta.length ; i++) {
			
		
			conta[i].exibirDetalhes();	
			
			
		}
		
		System.out.println("*************************");
		 
		
		
	}
	
	
}
