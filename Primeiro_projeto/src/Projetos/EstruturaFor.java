package Projetos;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inform o valor final do seu for ");
		int numerofinal = entrada.nextInt();
		
		for(int i = 1; i <= numerofinal; i++) {
			
			System.out.println(i);
		}
	}

}
