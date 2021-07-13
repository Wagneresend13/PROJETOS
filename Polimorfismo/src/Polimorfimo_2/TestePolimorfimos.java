package Polimorfimo_2;


public class TestePolimorfimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente contacorrente = new ContaCorrente();
		contacorrente.setSaldo(200d);
		contacorrente.setLimite(1000d);
		
		
		ContaPoupanca contapoupanca = new ContaPoupanca(500d);
		
		
		
		
		Conta [] conta = new Conta [] {contapoupanca,contacorrente};
		
		InformandoValores informacao = new InformandoValores();
		
		informacao.exibirValores(conta);
		
		
	

	}
}



