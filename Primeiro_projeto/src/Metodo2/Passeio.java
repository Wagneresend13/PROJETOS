package Metodo2;

public class Passeio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1 = new Pessoa();
		p1.nome =" Alice";
		
		
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nome = " Manu";
		
		
		Caminhada caminhada = new Caminhada();
		
		caminhada.andar(p1);
		
		
		
	}

}
