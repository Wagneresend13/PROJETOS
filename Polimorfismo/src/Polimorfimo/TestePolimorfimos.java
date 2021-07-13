package Polimorfimo;


public class TestePolimorfimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta conta = new Conta();
		conta.setSaldo(4000d);
		imprimirSaldo(conta);
		System.out.println();
		
		
		Conta contacorrente = new ContaCorrente();
		contacorrente.setSaldo(3500d);
		imprimirSaldo(contacorrente);
		System.out.println();
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000d);
		imprimirSaldo(contaPoupanca);
		System.out.println();

	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println(" Saldo da Conta : " + conta.getSaldo());
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println(" Imprimir Limite " + cc.getLimite() );
		}
		
		if(conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println(" Imprimir o Rendimento : " + cp.getRendimento());
		}
	}


}
