package Projetos;

public class Problema2 {

	public static void main(String[] args) {
		
		int numero = 6;
		int resultado = 1;
		
		while(numero >= 0) {
			
			resultado = resultado * numero;
			numero = numero - 1;
			
		}
		System.out.println("O valor do resultado é " + resultado);
	}

}
