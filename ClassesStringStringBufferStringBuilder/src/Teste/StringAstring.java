package Teste;

public class StringAstring {
	
	public static void main(String[] args) {
		
		
		
		String [] array = {"a", "b", "c", "d", "e", "f", "g","h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		StringBuffer sb = new StringBuffer();
		String xStringTemp = "";
		
		for(String  x : array) {	
		
			if(x.contains("w")) {
				
				sb.append(x);
			}
			
		}
		
		for(String  x : array) {
		
			if(x.contains("a")) {
				
				sb.append(x);
			}
		}
		
		for(String  x : array) {
			
			if(x.contains("g")) {
			
				sb.append(x);
			}
		}
		
		for(String  x : array) {
			
			if(x.contains("n")) {
				
				sb.append(x);
			}
		}	
		
		for(String  x : array) {
			
			if(x.contains("e")) {
				
				sb.append(x);
			}
		}	
		
		for(String  x : array) {
		
			if(x.contains("r")) {
			
				sb.append(x);
		}
	}	
		
		
		xStringTemp = sb.toString();
		System.out.println(xStringTemp);

	}
}
		
