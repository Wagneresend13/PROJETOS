package enums;

public class testeOperacaoEnum {

	public static void main(String[] args) {
		
		OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
		
		
		int resultado = o1.operacao(5,3);
		System.out.println(" Resultado  : " + resultado);
		
		for(OperacaoAritimetica  oa : OperacaoAritimetica.values()) {
			
			System.out.println(oa + " -- > " + oa.operacao(4, 2));
			
			
			
		}
		
		

	}

}
