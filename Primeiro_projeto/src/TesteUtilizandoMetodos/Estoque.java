package TesteUtilizandoMetodos;

public class Estoque {

	
	Produto []  produto;
	
	void listaProdutos() {
	
		System.out.println(" Produtos em Estoque ");
		
		for(int i = 0 ; i < produto.length ; i++) {
			
			produto[i].descrever();
			
		}
		
	
		}
	
	
	
}
