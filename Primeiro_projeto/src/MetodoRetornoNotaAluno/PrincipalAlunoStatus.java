package MetodoRetornoNotaAluno;

public class PrincipalAlunoStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculoMedia calculoMedia = new CalculoMedia();
		calculoMedia.nota1 = 6;
		calculoMedia.nota2 = 10;
		
		
		Situacao situacao = calculoMedia.situacaoCalculoMedia();
		
		System.out.println("O aluno esta " + situacao.situacaoAprovado);
		System.out.println("O aluno esta "+  situacao.situacaoRerovado);
		System.out.println("Media do Aluno " + situacao.media);
		
	}

}
