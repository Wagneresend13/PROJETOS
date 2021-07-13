package TesteUtilizandoMetodos;

import java.util.Scanner;

public class PrincipalRascunho {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	char array [] = {'1' , '2', '3'};
	String contem = "";
	
	
	System.out.println(" Digite uma frase");
	String frase = entrada.nextLine();
	
	
	
	for(int i = 0 ; i < frase.length(); i++) {
		
		if(frase.charAt(i) == 'b') {
			System.out.println("sim");
			
		}else {
			System.out.println("não");
		}
		
	}	
	
	
	
}

}
