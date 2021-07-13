package Projetos;

import java.util.Scanner;

public class ExemploBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
	
		
		System.out.println("Informe um valor ");
		int valor = entrada.nextInt();
		
		for(int i = 100; i<=200;i++) {
			
			if(i % valor == 0) {
				break;
			}
			System.out.println(i);
			
		}
		System.out.println("Fim da execução ");

	}

}
