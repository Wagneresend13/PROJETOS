package VideoPolimorfismoYoutube_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.println(" Entre com o número de contribuinte");
		Integer N = entrada.nextInt();
		
		for(int i = 1 ; i < N+1 ; i ++ ) {
			
		
			
			System.out.println(" Dados do " + i + " Primeiro contribuinte");
			System.out.println(" Pessoa Fisica ou pessoa Juridica ?  (i / c)  ");
			char type = entrada.next().charAt(0);
			
			System.out.println("Informe o Nome ? ");
			String nome = entrada.next();
			entrada.nextLine();
			System.out.println(" Informe sua Renda Anual ?");
			Double rendaAnual = entrada.nextDouble();
			
			if(type == 'i') {
				System.out.println(" Informe gastos com Saúde ? ");
				Double gastosComSaude = entrada.nextDouble();
				list.add(new PessoaFisica(nome , rendaAnual , gastosComSaude));
			}else {
				System.out.println(" Informe a quantidade de Funcionários ?");
				Integer numero_funcionarios = entrada.nextInt();
				list.add(new PessoaJuridica(nome , rendaAnual ,numero_funcionarios));
				
			}
			
		}
		
		System.out.println();
		System.out.println("Impostos");
		
		for(TaxPayer tp : list) {
			
			System.out.println(tp.getNome() + ": " + tp.tax());
		}
		

		double soma = 0.0;
		for(TaxPayer tp : list) {
			
			soma = soma + tp.tax();
		}
		
		System.out.println(" Total : " + soma);
		
		
		
		
		
		
		entrada.close();
		
		
	}
}
