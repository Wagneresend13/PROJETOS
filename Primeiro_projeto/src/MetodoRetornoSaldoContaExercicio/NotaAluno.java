package MetodoRetornoSaldoContaExercicio;

public class NotaAluno {

	double nota1;
	double nota2;
	double nota3;
	double nota4;
	double media;
	
	StatusAluno statusAluno;	
	
	double calculoMedia(double nota1 , double nota2, double nota3 , double nota4) {
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		return media;
		
	}
	
	public void statusAluno1 (StatusAluno statusAluno) {
		
		if(media >= 6) {
			System.out.println(statusAluno.aprovado);
		}else if (media < 6) {
			System.out.println(statusAluno.reprovado);
		}
		
		
	}
	
	
}
