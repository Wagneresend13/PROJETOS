package Metodo2;

import java.util.Scanner;

public class PrincipalCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		
		Calculadora operacoes = new Calculadora();
		
		System.out.println("Informe o n�mero 1 ");
		operacoes.num1 = entrada.nextDouble();
		System.out.println("Informe o n�mero 2 ");
		operacoes.num2 = entrada.nextDouble();
		
		
		System.out.println("A soma dos n�meros � = " + operacoes.operacaoSoma( operacoes.num1, operacoes.num2));
		System.out.println("A subtra��o dos n�meros � = "+ operacoes.operacaoSubtracao( operacoes.num1, operacoes.num2));
		System.out.println("A multiplica��o dos n�meros � = " + operacoes.operacaoMultiplicacao(operacoes.num1, operacoes.num2));
		System.out.println("A divis�o dos n�meros � = " + operacoes.operacaoDivisao(operacoes.num1, operacoes.num2));

	}

}
