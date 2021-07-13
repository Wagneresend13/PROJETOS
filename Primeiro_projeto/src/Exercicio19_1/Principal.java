package Exercicio19_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Contato contato = new Contato();
		
		
		
		for(int i = 0 ; i < 1 ; i++) {
		
			
		System.out.println(" Digite o nome da Pessoa");
		String nome = entrada.nextLine();
		contato.setNome_contato(nome);
		contato.nome.add(contato.getNome_contato());
		
		System.out.println(" Digite o numero de telefone ");
		String telefone = entrada.nextLine();
		contato.setTelefone_contato(telefone);
		contato.telefone.add(contato.getTelefone_contato());
		
		
		System.out.println(" Digite o cpf da Pessoa");
		String cpf = entrada.nextLine();
		contato.setCpf_usuario(cpf);
		contato.cpf.add(contato.getCpf_usuario());
		
		}
		
		
		
		System.out.print("Nome : " + contato.nome.toString() + " CPF : " + contato.cpf.toString() + " Telefone : " + contato.telefone.toString());

		

	}

}
