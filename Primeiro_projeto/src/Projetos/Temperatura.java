package Projetos;

import java.util.Scanner;



public class Temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			double c;
			double k;
			double f;
			double re;
			double ra;
			
			System.out.println("Informe o valor do Celcios");
			c = entrada.nextDouble();
			
			// o Calculo para as temperadutas 
			
			f = c * 1.8 + 32;
			k = c + 273.15;
			ra = c * 1.8 + 32 + 459.67;
			re = c * 0.8;
			
			System.out.println("O valor de f " + f);
			System.out.println("O valor de k " + k );
			System.out.println("O valor de ra "+ ra );
			System.out.println("O valro de re " + re);

	}

}
