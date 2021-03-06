package DesafioClasse_Math_6_3;

import java.util.Random;

public class MegaSena {
	
	public static final int NUMERO_MAXIMO = 60;
	public static final int  QUANTIDADE_NUMEROS = 6;

	
	private int[] numeroSorteados;
	

	private boolean jaFoiSorteado(int numero) {
		
		boolean resultado = false;
		
		for(int i = 0 ; i < this.numeroSorteados.length ; i ++) {
		
			if(this.numeroSorteados[i] == numero) {
				
				resultado = true;
				
				break;
			}	
		}	
		return resultado;
	}
	
	
	public void sortear() {
		
		this.numeroSorteados = new int[QUANTIDADE_NUMEROS];
		
		for(int i = 1 ; i <= QUANTIDADE_NUMEROS ; i++) {
			
			int numeroAleatorioGerado = new Random().nextInt(NUMERO_MAXIMO);
			
			if(!this.jaFoiSorteado(numeroAleatorioGerado) && numeroAleatorioGerado != 0) {
				
				this.numeroSorteados[i-1] = numeroAleatorioGerado;
			}else {
				
				i--;
			
			
			}	
		}	
	}
	
	public void exibirNumeros() {
		
		for (int lendoArray : numeroSorteados) {
			System.out.println(lendoArray + " ");
		}
		System.out.println();
	}
		
}
