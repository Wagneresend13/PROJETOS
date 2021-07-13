package EncapsulamentoModificadoresAcesso;

public class ArCondicionado {

	 private int temperatura;
	
	void mudarTemperatura(int temperatura) {
		
		if( temperatura >= 17 && temperatura <= 25) {
			this.temperatura = temperatura;
		}
	}
	
	int obterTemperatura() {
		return temperatura;
	}
	
}
