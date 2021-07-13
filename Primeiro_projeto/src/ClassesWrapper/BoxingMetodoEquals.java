package ClassesWrapper;

import java.util.Scanner;

//import sun.jvm.hotspot.tools.SysPropsDumper;

public class BoxingMetodoEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Integer i1 = 127;
		Integer i2 = 127;
		
		System.out.println(i1.equals(i2));
		
		String nome = "Wagner";
		String Nome2;
		
		System.out.println("Informe o nome ");
		Nome2 = entrada.nextLine();
		System.out.println(nome.equals(Nome2));
		
	}

}
