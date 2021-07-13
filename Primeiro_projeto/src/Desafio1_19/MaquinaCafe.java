package Desafio1_19;

public class MaquinaCafe {
	
	public Integer acucarDisponivel;
	
	
	MaquinaCafe(){
		
	}
	
	public void fazerCafe(int qtdAcucar) {
		
		if(acucarDisponivel < qtdAcucar) {
			System.out.println(" Não contém a quantidade informada, na cafeteira possui apenas " 
					+ this.acucarDisponivel);
		}else {
			acucarDisponivel = acucarDisponivel - qtdAcucar;
			System.out.println(" fazendo café com " + qtdAcucar + "  gramas de açucar");	
		}		
	}

	public void fazerCafe() {
		
		fazerCafe(10);
		
	}
	
	
	
	public Integer getAcucarDisponivel() {
		return acucarDisponivel;
	}

	public void setAcucarDisponivel(Integer acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}

	
	
}
