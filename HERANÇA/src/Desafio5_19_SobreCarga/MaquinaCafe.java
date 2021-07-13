package Desafio5_19_SobreCarga;

public class MaquinaCafe {

	private int acucarDisponivel;
	
	
	



	MaquinaCafe(){
		
	}
	
	
	
	
	public void facerCafe(Integer qtd_acucar) {
		
		if(qtd_acucar > this.acucarDisponivel) {
			System.out.println(" Não acucar disponível para fazer café");
		}else {
			
			this.acucarDisponivel = this.acucarDisponivel - qtd_acucar;
			System.out.println(" Fazendo café");
		}		
	}
	
	public void fazerCafe() {
		
		this.facerCafe(10);
		
		
	}
	
	public int getAcucarDisponivel() {
		return acucarDisponivel;
	}




	public void setAcucarDisponivel(int acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}

	
	
}
