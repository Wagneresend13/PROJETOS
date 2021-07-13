package VideoPolimorfismoYoutube_1;

public class PrincipalPolimorfismo {

	public static void main(String[] args) {
		
		Transporte t = new Transporte();
		Veiculo v = new Veiculo();
		Carro c = new Carro();
		
		moverTransporte(t);
		moverTransporte(v);
		moverTransporte(c);
		
		
	}
	
	static void moverTransporte(Transporte transporte) {
		
		System.out.println(transporte.mover(null));
		
		
		
	}
	
	
}
