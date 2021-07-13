package ProvaEstagiario;

import java.util.Scanner;

public class Usuario {
	Scanner entrada = new Scanner(System.in);
	
	Integer codigo_usuario;
	Integer senha_usuario = 9999;
	
	
	void ValidacaoCodigoUsuario(Integer codigo_usuario) {
		
		if(codigo_usuario.equals(this.codigo_usuario)) {
			System.out.println("Senha Correta");
			SenhaUsuario();
		}else{
			System.out.println("Programa Encerrado");
		}
		
	}
	
	void SenhaUsuario() {
		
		System.out.println(" Digite sua senha");
		Integer senha = entrada.nextInt();
		
		if(senha.equals(this.senha_usuario)) {
			System.out.println(" Senha Correta");
		}else {
			System.out.println(" Senha Incorreta");
			SenhaIncorreta();
		}		
		
	}
	
	void SenhaIncorreta() {
		
		System.out.println(" Digite uma das opções = [1] Tentar novamente [0] Sair do Sistema");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1 :
			SenhaUsuario();
			break;
		case 0 :
			System.out.println(" Programa Encerrado");
			break;		
		default :
			System.out.println(" Código diferente do solicitação");	
		}	
	}
	
}
