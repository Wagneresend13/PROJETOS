package Desafio5_11;

public class MatematicaUtil {
	
	public static final double valorPi = 3.14;
	
	public static int calcularFibonacci(int posicao) {
		
		if(posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao -1) + calcularFibonacci(posicao - 2);	
	}
	
	
	public static double calcularAreaCirculo(double raio) {
		double areaCirculo;
		areaCirculo = (Math.pow(raio, 2)) * valorPi ; // Math.pow para trabalhar com número em expotencia
		// exemplo Raio2
		
		return areaCirculo;
	}

}
