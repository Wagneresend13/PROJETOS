package ClasseAbstrata;

public class TesteClasseAbstrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p = new ProdutoPerecivel();
		p.descricao = " Caixa de leite";
		
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.dataValidade = " 10/03/2021";
		
		pp.imprimirDescricao();
		

	}

}
