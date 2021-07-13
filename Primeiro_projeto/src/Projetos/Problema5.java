package Projetos;

public class Problema5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 15;
		int x = 0;
		
		while ( a < b || x < 16) {
			x = x + 1;
			int indice = 0;
			while(indice < 5) {
				a = a + 2;
				b = b + 1;
				indice = + 1;
				x = x + 1;
				System.out.println("O valor de x é :" + x);
			}
		}
		System.out.println("O valor de x é :" + x);
		

	}
	

}
