package Array;

public class TesteArraysPrincipal {

	public static void main(String[] args) {
		
		// array de 3 poisições com o tipo String 
		String [] string = new String[3];
		
		// Criando o array com 4 posições 
		int [] notas =  new int [4];
		
		// declarando cada posição em um número , o array começa com a posição zero .
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		
		System.out.println(notas[0]);
		
		// utilizando for para percorrer o array , ( length ) É UTILIZADO PARA PERCORRER O TAMANHO DO ARRAY .
		for(int i = 0; i < notas.length; i++) {
			System.out.println("posição " + i + " = " + notas[i]);
		}
		

	}

}
