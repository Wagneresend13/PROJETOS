package MetodoRetornoSaldoContaExercicio;

public class PrincipalConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente novaConta = new ContaCorrente();
		
		
		novaConta.definirSaldoIniciado(1000);
		System.out.println("O valor do saldo � " + novaConta.saldo);
		
		novaConta.sacar(500);
		novaConta.depositar(50);
		
		System.out.println("O valor do Saldo � " + novaConta.saldo);
		
		novaConta.sacar(600);
		
		System.out.println("o Valor do saldo � " +  novaConta.saldo);
		
		

		
		
		
	}

}
