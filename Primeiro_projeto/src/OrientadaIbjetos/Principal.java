package OrientadaIbjetos;

public class Principal {

	public static void main(String[] args) {
		
		Carro meuCarro; // declarando a variavel
		meuCarro = new Carro(); // instanciando a variavel com um objeto dp tipo Carro
		
		Carro seuCarro;
		seuCarro = new Carro();
		
		meuCarro.modelo = "Fiesta";
		meuCarro.anoFabricacao = 2010;
		
		
		System.out.println("modelo do carro " + meuCarro.modelo);
		System.out.println("Ano de Fabricação " + meuCarro.anoFabricacao);
		
		
		
		
		
		
	}
	
}
