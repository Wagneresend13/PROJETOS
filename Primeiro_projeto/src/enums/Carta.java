package enums;

public class Carta {

	
		private int numero;
		private Naipe naipe;
		
		
		public Carta(int numero , Naipe naipe) {
			this.numero = numero;
			this.naipe = naipe;
		}
		
		public void imprimirCarta() {
			System.out.println(" Sou n�mero "+ numero + " de " + naipe + " De cor : " + naipe.getCor());
		}
}
