package MetodoRetornoImc;

import java.util.Scanner;

public class PrincipalMetodoRetorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Paciente p = new Paciente();
		p.peso = 100;
		p.altura = 1.65;
		
		
		IMC imc = p.calcularIndiceDeMassaCorpotal();
		
		System.out.println("Abaixo do peso ideal : " + imc.abaixoDoPesoIdeal);
		System.out.println("peso ideal : " + imc.pesoIdeal);
		System.out.println("Obseso : " + imc.obeso);
		System.out.println("grau de obesidade : " + imc.grauObesidade);
		
		
		
		
		

	}

}
