package OrientadaIbjetos;

public class PrincipalCachorro {

	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		
		meuCachorro.nome = "Bidu";
		meuCachorro.idade = 10;
		meuCachorro.raca = "boxer";
		meuCachorro.sexo = 'M';
		
		Cachorro seuCachorro = new Cachorro();
		
		seuCachorro.nome = " Rafel";
		
		System.out.println("Nome do Cachorro: "+ meuCachorro.nome);
		System.out.println("Idade do Cachorro : " + meuCachorro.idade);
		System.out.println("Raça do cachorro : " + meuCachorro.raca);
		System.out.println("Sexo do cachorro : " + meuCachorro.sexo);
		
		System.out.println("");
		System.out.println("Nome do Cachorro " + seuCachorro.nome);
		
		
	}
}
