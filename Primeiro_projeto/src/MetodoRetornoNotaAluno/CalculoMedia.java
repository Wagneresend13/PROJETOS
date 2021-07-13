package MetodoRetornoNotaAluno;

public class CalculoMedia {

	double nota1;
	double nota2;
	
	
	Situacao situacaoCalculoMedia(){
		Situacao status = new Situacao();
		Double media = (nota1 + nota2) / 2;
		status.media = media;
		
	if(media > 6) {
		status.situacaoAprovado = " Aprovado";
	}else if(media < 6) {
		status.situacaoRerovado = " Reprovado";
		
	}
	
	return status;
				
	}
		
}
