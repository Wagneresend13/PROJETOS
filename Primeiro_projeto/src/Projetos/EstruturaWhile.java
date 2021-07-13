package Projetos;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numeroInicial;
		int numeroFinal;
		int numeroAtual;
		
		
		System.out.println("Digite o Número Inicial");
		numeroInicial = entrada.nextInt();
		
		System.out.println("Digite o número final ");
		numeroFinal = entrada.nextInt();
		
		numeroAtual = numeroInicial;
		
		
		while(numeroAtual <= numeroFinal) {
			
			System.out.println(numeroAtual);
			numeroAtual++;
			
		}
		
		

	}

}
