package Classe.Math;

public class Classe_Math {

	public static void main(String[] args) {
		
		// comprimento de uma circunfer?ncia 2 x r x PI 
		int raio = 4;
		double comprimento = 2 * raio * Math.PI;
		System.out.println(" Comprimento : " + comprimento);
		
		
		// Maximo e Minimo 
		// Metodo para saber menor e maior dos valor
		// exemplo utilizando Math
		
		
		double  [] precoProdutoA = {30.20 , 25.49};
		System.out.println(" Maior pre?o :  " + Math.max(precoProdutoA[0], precoProdutoA [1]));
		System.out.println(" Menor pre?o :  " + Math.min(precoProdutoA[0], precoProdutoA [1]));
		
		// Exemplo de potencia
		System.out.println();
		System.out.println("2^3" + Math.pow(2, 3));
		
		// Raiz Quadrada 
		System.out.println();
		System.out.println(" Raiz de 9 " + Math.sqrt(9));
		
		//Arrendondamento
		System.out.println();
		 double n = 5.68;
		 System.out.println(" Maior Inteiro " +  Math.ceil(n));
		 System.out.println(" Menor inteiro " + Math.floor(n));
		 System.out.println(" Arrendondando " + Math.round(n));
		 
		 // N?meros Randomicos
		  double numeroAleatorio = Math.random();
		  System.out.println(numeroAleatorio);
		 
		
		
		
		
		
	}
}
