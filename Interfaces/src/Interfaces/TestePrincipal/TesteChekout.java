package Interfaces.TestePrincipal;

import Interfaces.caixa.Chekout;
import Interfaces.caixa.Compra;
import Interfaces.impressao.Impressora;
import Interfaces.impressao.ImpressoraEpson;
import Interfaces.pagamento.Operadora;
import Interfaces.pagamento.*;

public class TesteChekout {

	
	public static void main(String[] args) {
		
		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves");
		cartao.setNumeroCartao("123");
		
		Compra compra  = new Compra();
		compra.setNomeCliente("José Pereira");
		compra.setProduto("sabonete");
		compra.setValorTotal(2.5);
		
		Chekout chekout = new Chekout(operadora , impressora);
		chekout.fecharCompra(compra, cartao);
		
		
		
	}
}
