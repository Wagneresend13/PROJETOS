package Desafio1_19;

public class MaquinaCafe {
	
	public Integer acucarDisponivel;
	
	
	MaquinaCafe(){
		
	}
	
	public void fazerCafe(int qtdAcucar) {
		
		if(acucarDisponivel < qtdAcucar) {
			System.out.println(" N�o cont�m a quantidade informada, na cafeteira possui apenas " 
					+ this.acucarDisponivel);
		}else {
			acucarDisponivel = acucarDisponivel - qtdAcucar;
			System.out.println(" fazendo caf� com " + qtdAcucar + "  gramas de a�ucar");	
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
