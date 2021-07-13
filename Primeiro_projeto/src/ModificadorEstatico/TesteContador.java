package ModificadorEstatico;

public class TesteContador {

	public static void main(String[] args) {
		
		Contador.COUNT++;
		Contador.NOME = " Pedro";
		
		int valor = Contador.COUNT;
		
		Contador.incrementar();
		
		System.out.println(" Valor : " + Contador.COUNT);
		System.out.println("Nome : " + Contador.NOME);
		
	}
}
