package Projetos;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double rec1;
		double rec2;
		double media;
		
		
		
		
		System.out.print("Informe o valor da nota 1: ");
		nota1 = entrada.nextDouble();
		
		while(nota1 >10 || nota1 < 0) {
			System.out.println("Nota deve ser entre 0 e 10, digite o valor novamente");
			System.out.println("Informe o valor da nota 1");
			nota1 = entrada.nextDouble();
		}
		
		
		System.out.print(" Informe o valor da nota 2: ");
		nota2 = entrada.nextDouble();
		
		while(nota2 >10 || nota2 < 0) {
			System.out.println("Nota deve ser entre 0 e 10, digite o valor novamente");
			System.out.println("Informe o valor da nota 2");
			nota2 = entrada.nextDouble();
		}
	
						
		
		media = (nota1 + nota2)/2 ;
		
		if(nota1 < 6){
			System.out.print("O valor da nota 1 foi menor que 6, informe o valor da recuperação ");
			rec1 = entrada.nextDouble();
			nota1 = rec1;
			System.out.println("O valor da Recuperação é " + nota1);
			
		}if(nota2 < 6){
			System.out.print("O valor da nota 2 foi menor que 6, informe o valor da recuperação ");
			rec2 = entrada.nextDouble();
			nota2 = rec2;
			System.out.println("O valor da Recuperação é " + nota2);					
		}
			media = (nota1 + nota2)/2 ;
			System.out.print("O valor da média é : " + media);								
		}
		

	}

