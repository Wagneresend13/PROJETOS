package MetodoRetornoSaldoContaExercicio;

import java.util.Scanner;

public class PrincipalEntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		NotaAluno notaAluno = new NotaAluno();

		System.out.println(" Informe a nota 1 ");
		notaAluno.nota1 = entrada.nextDouble();
		
		System.out.println("Informe a nota 2");
		notaAluno.nota2 = entrada.nextDouble();
		
		System.out.println("Informe a nota 3");
		notaAluno.nota3 = entrada.nextDouble();
		
		System.out.println("Informe a nota 4");
		notaAluno.nota4 = entrada.nextDouble();
		
		notaAluno.calculoMedia(notaAluno.nota1, notaAluno.nota2, notaAluno.nota3, notaAluno.nota4);
		
		System.out.println("A média é " + notaAluno.media);
		
		//notaAluno.statusAluno = new StatusAluno();
		StatusAluno statusAluno = new StatusAluno();
		notaAluno.statusAluno1(statusAluno);
	}

}
