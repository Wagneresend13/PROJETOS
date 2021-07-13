package Contrutores;

public class Pessoa {
	
	String nome;
	int idade;
	
	// Inicializando o contrutor
	Pessoa(String nome){
		this.nome = nome;
	}

	// sobrecarga de construtor
	Pessoa(String nome , int idade){
		this.nome = nome;
		this.idade = idade;
	}
}
