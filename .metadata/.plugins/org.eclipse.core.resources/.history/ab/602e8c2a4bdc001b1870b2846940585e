package Interfaces.pagamento;

import Interfaces.pagamento.Autorizavel;
import Interfaces.pagamento.Cartao;
import Interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		// TODO Auto-generated method stub
		return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal() < 100;
	}

}
