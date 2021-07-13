package TesteUtilizandoMetodos;

import java.util.Scanner;

public class PrincipalProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println(" Quantos produtos");
		int quantidaProdutos = entrada.nextInt();
		
		entrada.nextLine();
		
		Estoque estoque = new Estoque();
		
		estoque.produto = new Produto[quantidaProdutos];
		
		for(int i = 0 ; i < estoque.produto.length ; i++) {
			
			estoque.produto[i] = new Produto();
			System.out.println("Produto " + i);
			
			System.out.println("Descrição");
			
			estoque.produto[i].descricao = entrada.nextLine();
			
			System.out.println(" Quantidade de Itens");
			estoque.produto[i].qtd_produto = entrada.nextInt();
			entrada.nextLine();
			
		}
		
		estoque.listaProdutos();
		

	}

}
