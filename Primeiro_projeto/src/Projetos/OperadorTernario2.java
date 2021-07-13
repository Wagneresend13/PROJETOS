package Projetos;

import java.util.Scanner;

public class OperadorTernario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe o Valor entre [1] e [2]");
		valor = entrada.nextInt();
		
		int Operador = (valor == 1) ? 1 : 2;
		
		
		if(Operador == 1) {
			System.out.println("O valor do Operador é 1 ");
		}else {
			System.out.println("O operador é diferente de 1");
		}
		
		
		System.out.println("O valor é " + Operador);
		
	}

}
