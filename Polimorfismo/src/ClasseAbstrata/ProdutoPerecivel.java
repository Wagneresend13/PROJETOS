package ClasseAbstrata;

public class ProdutoPerecivel extends Produto{
	
	
	String dataValidade;

	@Override
	public void imprimirDescricao() {
		
		System.out.println("Descri��o : "  + super.getDescricao() + " Vencendo em : " + dataValidade);
		
	}

}
