package SobrePosicao;

import java.util.Date;

public class TesteSobrePosicao {

	public static void main(String[] args) {
		
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = " Caixa de fósforo";
		pp.datavalidade = new Date();
		pp.identificar();
		
		
		
		
	}
}
