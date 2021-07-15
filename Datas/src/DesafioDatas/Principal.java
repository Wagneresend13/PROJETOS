package DesafioDatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		
		new Principal();

	}
	
	
	Principal(){
		
		Scanner entrada = new Scanner(System.in);
		
		try {
		System.out.println("Data do Ultimo Per�odo Mentrual (dd/MM/yyyy)");
		String ultimoPeriodoMenstrual = entrada.nextLine();
		
		Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual);
		CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);
		
		Date dataEstimadaConcepcao = calculadora.calcularDatasEstimadaConcepcao();
		System.out.println("Data estimada da concep��o: " 
				+ this.formatarData(dataEstimadaConcepcao));
		
		Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
		System.out.println("Data estimada para parto: " 
			+ this.formatarData(dataEstimadaParto));
		
		}catch(ParseException e) {
			System.out.println("Informe uma data no padr�o dd/mm/aaaa.");
		}
		
	}
	
	private String formatarData(Date data) {
		
		DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", 
				new Locale("pt", "br"));
		
		return formatador.format(data);
	}
	
	private Date converterEmData(String texto) throws ParseException {
		DateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
		return conversor.parse(texto);
	}
	
	
	
	
}
