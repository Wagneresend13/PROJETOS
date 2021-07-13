package Metodo2;

import java.util.Scanner;

public class PrincipalCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		
		Calculadora operacoes = new Calculadora();
		
		System.out.println("Informe o número 1 ");
		operacoes.num1 = entrada.nextDouble();
		System.out.println("Informe o número 2 ");
		operacoes.num2 = entrada.nextDouble();
		
		
		System.out.println("A soma dos números é = " + operacoes.operacaoSoma( operacoes.num1, operacoes.num2));
		System.out.println("A subtração dos números é = "+ operacoes.operacaoSubtracao( operacoes.num1, operacoes.num2));
		System.out.println("A multiplicação dos números é = " + operacoes.operacaoMultiplicacao(operacoes.num1, operacoes.num2));
		System.out.println("A divisão dos números é = " + operacoes.operacaoDivisao(operacoes.num1, operacoes.num2));

	}

}
