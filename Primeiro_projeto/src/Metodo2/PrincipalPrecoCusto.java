package Metodo2;

public class PrincipalPrecoCusto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Preco preco = new Preco();
		Produto produto = new Produto();
		
		preco.valorCustos = 140;
		produto.definirPreco(preco, 20, 15);
		
		System.out.println(" Valor custo " + preco.valorCustos);
		System.out.println(" valor Imposto " + preco.valorImpostos);
		System.out.println(" Valor lucro "+ preco.valorLucro);
		System.out.println("  precço venda " + preco.precoVenda);
	
	}

}
