package Projetos;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;

		
		System.out.println("Informe a sua Idade");
		idade = entrada.nextInt();
							
		// Express�o booleana ( valor verdadeiro/ valor falso)
		String indicacao = (idade >= 18) ? "Adulto" : "Crian�a ou adolescente";
		
		System.out.println("Resultado : " + indicacao);
		
		

	}

}
