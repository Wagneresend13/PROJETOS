package Sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroPessoa cadastro = new CadastroPessoa();
		
		Pessoa pessoa = new Pessoa("jos� " , 32, " email.com");
		Pessoa pessoa2 = new Pessoa("Wagner" , 28 , "Wagnerresende@gmail.com");
		cadastro.cadastrar(pessoa);
		cadastro.cadastrar(pessoa2);
		
		//___________________________________________
		
		
		cadastro.cadastrar("Maria", 22,"");
		

	}

}
