package MetodoRetornoSaldoContaExercicio;

public class ContaCorrente {
	
	
	float saldo;
	
	void  definirSaldoIniciado(float valor) {
		
		saldo = valor;
				
	}
	
	
	float depositar (float valor) {
		
		saldo = valor + saldo;
		return saldo;
	}
	
	float sacar(float valor) {
		boolean sim = true;
		boolean nao = false;
		
		if(valor > saldo) {
			System.out.println(nao);
		}else{
			System.out.println(sim);

		saldo = saldo - valor;
		
		}
		return saldo;

	}
	

}
