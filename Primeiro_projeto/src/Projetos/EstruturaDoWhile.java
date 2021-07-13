package Projetos;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		int soma = 0;
		
		do {
			System.out.println("Informe o valor para somar ou 0 para sair da condição");
			valor = entrada.nextInt();
			soma = valor + soma;
			System.out.println("Valor da soma " + soma);
		}while(valor!= 0);
		

	}

}
