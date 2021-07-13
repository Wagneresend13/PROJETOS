package Projetos;

import java.util.Scanner;

public class EstruturaFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inform o valor final do seu for ");
		int numerofinal = entrada.nextInt();
		
		for(int i = 1; i <= numerofinal; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
				
			}
		}
	}

}
