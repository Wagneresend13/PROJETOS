package Projetos;

import java.util.Scanner;

public class EstruturaDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor1;
			
		do {
			System.out.println("Informe a opção [1] ou [0] para sair ");
			 valor1 = entrada.nextInt();
			System.out.println("Valor Informado é = " + valor1);
			
			
			
		}while(valor1 != 0);
		
		

	}

}
