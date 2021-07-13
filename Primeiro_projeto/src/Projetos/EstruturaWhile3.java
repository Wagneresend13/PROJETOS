package Projetos;

import java.util.Scanner;

public class EstruturaWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int voto;
		int canditado1 =0;
		int canditado2 =0;
		int canditado3 =0;
		int nulo = 0;
		int branco = 0;

		System.out.println("Informe o canditado que deseja votar");
		System.out.println("1. Candidato Jair Rodrigues");
		System.out.println("2. Candidato Carlos Luz ");
		System.out.println("3. Candidato Neves Rocha ");
		System.out.println("4. Nulo ");
		System.out.println("5. Branco");
		
		
		
		do {
				
			System.out.println("Informe o Voto");
			voto = entrada.nextInt();
				
				if(voto == 1) {
					canditado1++;
					System.out.println(canditado1);
				}else if(voto == 2) {
					canditado2++;
					System.out.println(canditado2);
				}else if(voto == 3) {
					canditado3++;
					System.out.println(canditado3);
				}if(voto == 4) {
					nulo++;
				}if(voto == 5) {
					branco++;
				}
		}while(voto != 6); 
			
		if((canditado1 < canditado3) && (canditado2 < canditado3 )){
			System.out.println(" Vencedor foi o Candidato 3");
			
		}else if((canditado3 < canditado2) && (canditado1 < canditado2)){
			System.out.println(" Vencedor foi o candidato 2");
			
		}else if((canditado3 < canditado1) && (canditado2 < canditado1)) {
			System.out.println(" Vencedor foi o candidato 1");
		}
		if((canditado1 == canditado2) || (canditado2 == canditado3) || (canditado3 ==canditado1 )){
			System.out.println(" Empate nos votos");
		}
	
		System.out.println("Quantidade de voto para o Candidato 1 " + canditado1);
		System.out.println("Quantidade de voto para o Candidato 2 " + canditado2);
		System.out.println("Quantidade de voto para o Candidato 3 " + canditado3);
		

	}

}
