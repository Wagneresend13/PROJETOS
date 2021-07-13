package Projetos;

import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tipoVeiculo;
		int velocidadePermitida;
		int velocidadeVeiculo;
		
		
		System.out.println(" Informe o tipo de veículo ");
		tipoVeiculo = entrada.nextInt();
		
		
		System.out.println(" Informe a velocidade Permitida");
		velocidadePermitida = entrada.nextInt();
		
		System.out.println(" Informe a velocidade do veículo");
		velocidadeVeiculo = entrada.nextInt();
		
		if((tipoVeiculo == 1 && velocidadeVeiculo > velocidadePermitida * 1.1) || (tipoVeiculo == 2 && velocidadeVeiculo > velocidadePermitida * 1.05)){
			System.out.println(" Veículo será multado");
		}else{
			System.out.println(" Veículo não será multado");
		}

	}

}
