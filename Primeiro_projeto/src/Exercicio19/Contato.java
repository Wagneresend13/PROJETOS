package Exercicio19;

import java.util.Scanner;

public class Contato {
	
	String nome_contato;
	String telefone_contato;
	String cpf_usuario;
	
	public Contato() {
		
	}
	
	public Contato(String nome_contato , String telefone_usuario , String cpf_usuario) {
		this.nome_contato = nome_contato;
		this.telefone_contato = telefone_usuario;
		this.cpf_usuario = cpf_usuario;
	}
	
	
	public String getNome_contato() {
		return nome_contato;
	}
	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}
	public String getTelefone_contato() {
		return telefone_contato;
	}
	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
	}
	public String getCpf_usuario() {
		return cpf_usuario;
	}
	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}
	
	void ListarContato() {
		
		System.out.println(" O nome do Contato é  " + this.nome_contato + " e o Cpf é  " +
		this.cpf_usuario + " e o seu telefone é " + this.telefone_contato);
		
		
	}
	
	
}
