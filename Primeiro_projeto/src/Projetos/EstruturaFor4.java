package Projetos;

import java.util.Scanner;

public class EstruturaFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero = 10;
		int valor;
		int countPar = 0;
		int countImpar =0;
		
		
		for(int i = 1; i<=numero;i++) {
			
			System.out.println("Informe o numero");
			valor = entrada.nextInt();
			
			if(valor % 2 == 0) {
				countPar++;
			}
			if(valor % 2 > 0) {
				countImpar++;
			}
			
		}
		System.out.println("Quantidade de numeroes Pares " + countPar);
		System.out.println("Quanridade numeros Impares "+countImpar);
		
		

	}

}
