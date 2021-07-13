package heranca3;

public class TestarHeranca {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Wagner");
		gerente.setCpf("0556713881");
		gerente.setSenha(123456);
		
		gerente.autentica(123);		
	}
}
