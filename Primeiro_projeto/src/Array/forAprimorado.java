package Array;

public class forAprimorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayNumero = {87 ,68,52,5,49,83,45,12,64};
		int total = 0;
		
		// adicionar o valor de cada elemento a variavel total ;
		
		for(int i : arrayNumero) {
			
			// total inicia com zero , o " i " percorre todas as posições somando e colocando na varivel total 
			total = total + i;	
		
		}
		
		System.out.println(" Total de elementos a " + total);

	}

}
