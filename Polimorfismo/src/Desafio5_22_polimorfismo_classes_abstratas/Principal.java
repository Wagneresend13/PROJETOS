package Desafio5_22_polimorfismo_classes_abstratas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia neg�cios imobili�rios");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o ");
		
		Cliente atacadista = new Cliente();
		atacadista.setNome("Tri�ngulo quadrado atacadista");
		
		Cliente telecom = new Cliente();
		telecom.setNome("Fonenet Telecomunica��es");

		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da mtriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do m�s", 390d, "19/05/2012");
		
		
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de log�stica em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manuten��o em sistema de conta online", 
				53200d, "13/05/2012");
		
		
	
		RelatorioContas relatorio = new RelatorioContas();
		Conta [] conta = new Conta[] { contaPagar1 , contaPagar2 ,contaReceber1, contaReceber2};
		
		
		relatorio.relatorioContas(conta);
		
		
		
		
		
	}

}
