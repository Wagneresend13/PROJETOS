package ExerciciosUsandoArray;

import java.util.Scanner;

public class PrincipalExercicioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println(" Informe a quantidade");
		int quantidadeProdutos = entrada.nextInt();
		
		entrada.nextLine();
		
		Estoque estoque = new Estoque();
		
		estoque.produtos = new Produto[quantidadeProdutos];
		
		for(int i = 0 ; i < estoque.produtos.length ; i ++) {
			
			estoque.produtos[i] = new Produto();
			System.out.println(" Produto " + i);
			System.out.println("------");
			
			System.out.println(" Descrição");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.println(" Quantidade de itens ");
			estoque.produtos[i].qtd_produto = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();
		
		
		
	}

}
