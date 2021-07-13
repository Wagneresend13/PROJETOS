package ObjetoThis;

public class ExemploThis {
	
public static void main(String[] args) {
	
	Carro carro = new Carro();
	carro.modelo = " Palio";
	
	System.out.println(" O modelo de Antes : " + carro.modelo);
	
	carro.alterarModelo("civic");
	
	System.out.println(" O modelo depois da Alteração : " + carro.modelo);
	
}

}
