package Sobrecarga;

public class CadastroPessoa {

	public void cadastrar(Pessoa pessoa) {
		armazenar(pessoa.getNome(),  pessoa.getIdade(), pessoa.getEmail());
		
	}	
	
	public void cadastrar(String nome , int idade , String email) {
		armazenar(nome,idade,email);
	}
	
	
	public void cadastrar(String nome ) {
		
		armazenar(nome,0,"");
		
	}
	
	
	
	private void armazenar(String nome , int idade , String email) {
		
		System.out.println("Salvando: " + nome + " Com idade de : " + idade + " email:  " + email);
		
		
		
	}
	
}
