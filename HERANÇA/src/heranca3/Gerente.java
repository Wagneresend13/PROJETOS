package heranca3;

public class Gerente extends Funcionario{

	
	private Integer senha;
	
	



	Gerente(){
		
	}


	public Gerente(String nome, String cpf, double salario) {
		super();
	}
	
	
	public boolean autentica(Integer testarSenha) {
		
		if(testarSenha.equals(senha)) {
			System.out.println(" Acesso concedido");
			return true;
		}else {
			System.out.println(" Acesso negado , senha incorreta");
			return false;
		}
		
		
	}
	
	public Integer getSenha() {
		return senha;
	}


	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
	
	
	
}
