package Projetos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int sexo;
		double peso;
		double altura;
		double imc;
		
		System.out.println("Informe o Sexo da pessoa");
		System.out.println("[1] para Homen");
		System.out.println("[2] para mulher");
		sexo = entrada.nextInt();
		
		System.out.println(" Informe o seu peso");
		peso = entrada.nextDouble();
		
		System.out.println(" Informe sua Altura");
		altura = entrada.nextDouble();
		
		imc = peso/(altura*altura);
		System.out.println(" valor do imc " + imc);
		
		if((sexo == 1 && imc <19.1) || ( sexo == 2 && imc < 20.7)){
			System.out.println(" Abaixo do peso");
	}else if ((sexo == 1 && imc >= 19.1 && imc < 25.8) || ( sexo == 2 && imc >= 20.8 && imc < 26.4)){
		System.out.println(" No peso Ideal");
	}else if((sexo == 1 && imc >= 25.9 && imc < 27.3) || (sexo == 2 && imc >= 26.5 && imc < 27.8)){
		System.out.println(" Um pouco Acima do peso");
	}else if ((sexo == 1 && imc >= 27.4 && imc < 32.3) || (sexo == 2 && imc >= 27.9 && imc < 31.1)){
		System.out.println(" Acima do peso Ideal");
	}else if((sexo == 1 && imc > 32.3) || (sexo == 2 && imc > 31.1)){
		System.out.println(" Obeso ");
	}

	}

}
