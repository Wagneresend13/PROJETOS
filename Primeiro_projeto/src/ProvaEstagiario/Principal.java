package ProvaEstagiario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println(" Digite o código do usuário para Salvar o Código ");
		usuario.codigo_usuario = entrada.nextInt();
		
		
		System.out.println(" Digite o Código do usuário para Entrar no Sistema ");
		Integer codigoUsuario = entrada.nextInt();
		
		usuario.ValidacaoCodigoUsuario(codigoUsuario);
	
		
		
	}

}
