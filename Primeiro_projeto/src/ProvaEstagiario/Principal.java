package ProvaEstagiario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println(" Digite o c�digo do usu�rio para Salvar o C�digo ");
		usuario.codigo_usuario = entrada.nextInt();
		
		
		System.out.println(" Digite o C�digo do usu�rio para Entrar no Sistema ");
		Integer codigoUsuario = entrada.nextInt();
		
		usuario.ValidacaoCodigoUsuario(codigoUsuario);
	
		
		
	}

}
