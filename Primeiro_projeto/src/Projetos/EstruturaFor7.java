package Projetos;

import java.util.Scanner;

public class EstruturaFor7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor = 10;
		int valorTabuada;
		int resultado;
		
		System.out.println("Informe qual valor da tabuada");
		valorTabuada = entrada.nextInt();
		
		while(valorTabuada <= 0 || valorTabuada > 10) {
			System.out.println("Informe o valor correto entre 1 e 10");
			valorTabuada = entrada.nextInt();
			
		}
	
		
		for(int i = 1; i <=valor;i++) {
			
			
		resultado = valorTabuada * i;	
		System.out.println("A multiplicação do valor " + valorTabuada +" * "+ i +" é igual : " + resultado);
			
			
				}
			

	}

}
