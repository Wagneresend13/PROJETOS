package Desafio5_19_SobreCarga;

public class TesteMaquinaCafe {

	
	public static void main(String[] args) {
		
		MaquinaCafe maquinacafe = new MaquinaCafe();
		maquinacafe.setAcucarDisponivel(30);
		
		maquinacafe.facerCafe(10);
		maquinacafe.facerCafe(15);
		
		
		maquinacafe.fazerCafe();
	
		
		
	}
}
