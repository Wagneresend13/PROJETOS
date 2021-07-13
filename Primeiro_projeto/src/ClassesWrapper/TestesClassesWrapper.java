package ClassesWrapper;

public class TestesClassesWrapper {

	public static void main(String[] args) {
		// byte , short , int , long , float , double e char
		// Byte , Short , Integer , Long , Float , Double e Character
		
		int x = 5;
		Integer i = new Integer(x);
		
		byte y = i.byteValue();
		
		System.out.println(y);
		
		// Transformando uma String em um Double
		String valor = " 15.6";
		Double v = new Double(valor);
		
		System.out.println(v);
		
		// transformando a string dentro do ( ) em um INteiro e um Double .
		int idade = Integer.parseInt("27");
		double custo = Double.parseDouble("23.5");
		
		
		
		

	}

}
