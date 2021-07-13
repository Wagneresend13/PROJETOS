package Projetos;

import java.util.Scanner;

public class PagamentoIpva {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int finalPlaca;
		
		System.out.println("Informe o final da Plava ?");
		finalPlaca = entrada.nextInt();
		
		switch(finalPlaca) {
		
		case 1: 
			System.out.println("Vencimento na data 11 de janeiro");
			break;
			
		case 2: 
			System.out.println("Vencimento na data 12 de janeiro ");
			break;
			
		default:
			System.out.println(" Vencimento sem Data !");
		
		}
		
		
		

	}

}
