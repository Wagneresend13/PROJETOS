package VideoConcatenacaoStringBufferStringbuilder;

public class ConcatenacaoStringBufferStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] letras = {"B","C","D","E","F"};
		String alfabeto = "";
	
		
		
		for(String letra : letras) {
			
			alfabeto += letra;
			
		}
		
		System.out.println(alfabeto);
		
		StringBuffer sb = new StringBuffer();
		
		for(String letra : letras) {
			
			sb.append(letra);
			
		}
		
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		System.out.println(sb.reverse());
		
		
		
		
		
		
	}

}
