package Projetos;

import java.util.Scanner;

public class EstruturaWhile2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int senha = 4556;
		int valor ;
		System.out.println("Informe a senha ");
		valor = entrada.nextInt();
		
		
		while(valor != senha) {
			System.out.println("Informe a senha novamente. senha incorreta");
			valor = entrada.nextInt();
			System.out.println(" A senha digita foi" + valor);
		}
		System.out.println("senha correta");
		
		
	}

}
