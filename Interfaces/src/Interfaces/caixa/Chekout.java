package Interfaces.caixa;

import Interfaces.pagamento.*;
import Interfaces.impressao.*;

public class Chekout {
	
	private Operadora operadora;
	private Impressora impressora;
	
	public Chekout(Operadora operadora , Impressora impressora){
		this.operadora = operadora;
		this.impressora = impressora;		
	}
	
	public void fecharCompra(Compra compra , Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if(autorizado) {
			this.impressora.imprimir(compra);			
		}else {
			System.out.println(" Pagamento foi negado !");
		}
		
		
	}
	
	
	
	
	
	
}
