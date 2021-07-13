package Projetos;

import java.util.Scanner;

public class EstruturaFor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int resultado1;

		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Informe o Primeiro Valor ");
			valor1 = entrada.nextInt();
			System.out.println("Informe o Segundo Valor ");
			valor2 = entrada.nextInt();
			
			resultado1 = valor1 - valor2;
			System.out.println(" Resutado = "+ resultado1);
			
		}
		
	}

}
