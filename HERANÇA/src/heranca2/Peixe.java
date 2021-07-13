package heranca2;

public class Peixe extends Animal {
	
	private String caracteristicas;

	 

	Peixe() {
		
	}

	 Peixe(String nome, Float comprimento, Integer numeroDePatas, String cor, String ambiente,
			Float velocidadeMedia , String caracteristicas) {
		 
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.caracteristicas = caracteristicas;
	}
	 
	 	public String getCaracteristicas() {
			return caracteristicas;
		}

		public void setCaracteristicas(String caracteristicas) {
			this.caracteristicas = caracteristicas;
		}
	
		
		public void dados() {
			super.dados();
			System.out.println("Caracteristicas do Peixe :" + this.getCaracteristicas());		
		}
	

}
