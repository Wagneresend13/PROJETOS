package Projetos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um valor ");
		numero = entrada.nextInt();
		
		if(numero > 10) {
			System.out.println(" Maior que 10");
			
		}else {
			System.out.println(" não é maior que 10 ");
		}
		
		

	}

}
