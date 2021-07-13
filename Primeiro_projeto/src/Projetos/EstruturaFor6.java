package Projetos;

import java.util.Scanner;

public class EstruturaFor6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String validacaoEntrada = "sim";
		String validacao;
		int valor;
		int resultado;
		
		
		
		do {
			
			
			System.out.println(" Informe um valor ?");
			valor = entrada.nextInt();
			
			for(int i = 1; i<11 ;i++) {

			resultado = valor * i;
			System.out.println("Resultado : "+ resultado);
						
				}
			
			System.out.println("Deseja Continuar digite sim?");
			validacao = entrada.nextLine();
			entrada.nextLine();
			
			
		}while(validacaoEntrada.equals(validacao));
		
		System.out.println(" Programa Encerrado");
		
			}
	
		}

	
