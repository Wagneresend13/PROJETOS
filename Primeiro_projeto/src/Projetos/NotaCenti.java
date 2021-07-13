package Projetos;

import java.util.Scanner;

public class NotaCenti {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1= 0;
		double nota2 = 0;
		double rec1 = 0;
		double rec2 = 0;
		double media;
		
		System.out.println("Informe o valor da nota1");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe o valor da nota2");
		nota2 = entrada.nextDouble();
		
		System.out.println(" Informe o valor da recuperação 1");
		rec1 = entrada.nextDouble();
		
		System.out.println("Informe o valor da recuperação 2");
		rec2 = entrada.nextDouble();
		
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println(" Aluno Aprovado");
		}
		
		if(rec1 > nota1) {
			nota1 = rec1;
		}else if(rec1 <= nota1){
			nota1 = nota1;
		}else if(rec2 > nota2) {
			nota2 = rec2;
		}else if(rec2 <= nota2) {
			nota2 = nota2;
		}
		
		media = (nota1 + nota2) / 2;
		System.out.println("O valor da média é "+ media);
		
}
}