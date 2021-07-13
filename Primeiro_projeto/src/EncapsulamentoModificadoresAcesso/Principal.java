package EncapsulamentoModificadoresAcesso;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArCondicionado ar = new ArCondicionado();
		
		
		ar.mudarTemperatura(21);
		System.out.println(" O valor da temperatura  = " + ar.obterTemperatura());
		
		ar.mudarTemperatura(10);
		System.out.println(" O valor da temperatura  = " + ar.obterTemperatura());
		
	}

}
