package Projetos;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int maiorNumero;
		
		System.out.println("Digite o primeiro ");
		int numero = entrada.nextInt();
		
		System.out.println(" Digite o segundo n�mero");
		int numero2 = entrada.nextInt();
		
		if(numero > numero2) {
			maiorNumero = numero;
			System.out.println("O maior n�mero � " + maiorNumero);
		}else if (numero < numero2) {
			maiorNumero = numero2;
			System.out.println("O maior n�mero � " + maiorNumero);
		}else {
			System.out.println("N�mero Iguais ");
		}
		
		

	}

}
