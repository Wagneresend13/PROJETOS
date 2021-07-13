package Projetos;

import java.util.Scanner;

public class ClassificaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int codigoProduto = 0;
		
		do {
			
			System.out.println("Informe o código do produto");
			codigoProduto = entrada.nextInt();
			
		}while(codigoProduto != 0);
		
		if(codigoProduto != 0) {
			
			String corredor = (codigoProduto % 2 == 0) ? "\"direita\"" : "\" esquerda\"";
			
		}
	}

}
