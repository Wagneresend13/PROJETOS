package Desafio5_7;

public class PrincipalDesafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor imobibiliaria = new Fornecedor();
		imobibiliaria.setNome("Casa & Cia Imobili�rios");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do jo�o ");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2021");
		conta1.setFornecedor(imobibiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, " Compra do m�s " , 390d,"19/05/2012");
		ContaPagar conta3 = new ContaPagar(mercado, " Aluguel da Filial " , 700d,"11/05/2012");
		
		conta1.pagar(); 
		conta2.pagar();
		conta3.pagar();
	}

}
