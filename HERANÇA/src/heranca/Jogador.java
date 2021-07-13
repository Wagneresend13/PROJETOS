package heranca;

public class Jogador extends Pessoa{   // Habilitado opção extends na classe 

	 public boolean aindaJoga = false;
	
	
	public void dizerSeAindaJoga() {
		
		System.out.println("Ainda joga " + this.aindaJoga);
		
	}
	
}
