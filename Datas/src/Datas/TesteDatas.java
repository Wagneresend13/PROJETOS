package Datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
	
	public static void main(String[] args) {
		
		Date hoje = new Date();
		System.out.println(hoje);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(hoje));
		
		String dataAniversário = "06/07/1993";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date anivserario = formatador2.parse(dataAniversário);
			System.out.println(formatador.format(anivserario));
		} catch (ParseException e) {
			
			System.out.println(" Formato de data inválido");
		}
		
		
		
	}

}
