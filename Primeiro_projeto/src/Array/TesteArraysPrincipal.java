package Array;

public class TesteArraysPrincipal {

	public static void main(String[] args) {
		
		// array de 3 poisi��es com o tipo String 
		String [] string = new String[3];
		
		// Criando o array com 4 posi��es 
		int [] notas =  new int [4];
		
		// declarando cada posi��o em um n�mero , o array come�a com a posi��o zero .
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		
		System.out.println(notas[0]);
		
		// utilizando for para percorrer o array , ( length ) � UTILIZADO PARA PERCORRER O TAMANHO DO ARRAY .
		for(int i = 0; i < notas.length; i++) {
			System.out.println("posi��o " + i + " = " + notas[i]);
		}
		

	}

}
