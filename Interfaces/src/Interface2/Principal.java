package Interface2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Relat�rio relatorio = new Relat�rio();
		Quadrado quadrado = new Quadrado(4d);
		Triangulo triangulo = new Triangulo(16d , 23d);
	
		
		
		relatorio.relatorio(quadrado);
		relatorio.relatorio(triangulo);
		
		

		
		
	 	}
}
