package Array;

public class TesteArrayComCarro {

public static void main(String[] args) {
	// Criando um array do tipo objeto , buscando de outra Classe;
	Carro[] carros = new Carro [4];
	carros[0] = new Carro(); // criando um objeto na posição [0].
	
	carros[0].anoFabricacao = 2021; //declarando a posição [0] do array = 2021 , buscando o objeto criado.
	
	System.out.println(" Ano = " + carros[0].anoFabricacao);
}
	
}
