package SobrePosicao;

import java.util.Date;

public class TesteSobrePosicao {

	public static void main(String[] args) {
		
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = " Caixa de f�sforo";
		pp.datavalidade = new Date();
		pp.identificar();
		
		
		
		
	}
}
