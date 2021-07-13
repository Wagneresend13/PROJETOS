package Projetos;

import java.util.Scanner;

public class EstruturaFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		int resultado;
		
		System.out.println("Informe o valor entre 1 e 10");
		valor = entrada.nextInt();
		
		while((valor <= 1 || valor > 10)) {
			System.out.println(" Informe apenas o valor entre 1 e 10");
			valor = entrada.nextInt();
		}
		System.out.println("valor correto");
		
		for(int i = 1; i<=10;i++) {
			
			
			resultado = i * valor;
			System.out.println("O valor de "+ i + " * "+ valor+" é igual a = "+resultado);
			
			
		}
	}

}
