package ObjetoThis;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int AnoDeFabricacao;
	boolean biCombustível;
	
	
	void alterarModelo(String modelo) {
		
		if(modelo != null) {
			this.modelo = modelo;
		}
		
	}
	
	void ligar() {
	
		if( modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
			
			
		}
		
		
	}
	
	
}
