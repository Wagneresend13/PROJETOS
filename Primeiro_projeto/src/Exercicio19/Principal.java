package Exercicio19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite o nome do Contato");
		String nomeContato = entrada.nextLine();
		
		System.out.println(" Digite o telegone do Contato : " + nomeContato);
		String numeroContato = entrada.nextLine();
		
		System.out.println(" Digite o Cpf do Contato : " + nomeContato);
		String cpfContato = entrada.nextLine();
		

		Contato contato1 = new Contato(nomeContato , numeroContato, cpfContato);
		contato1.ListarContato();
		
		
		
		

	}

}
