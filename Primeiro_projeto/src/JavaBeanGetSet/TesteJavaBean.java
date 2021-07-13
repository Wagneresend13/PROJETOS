package JavaBeanGetSet;

public class TesteJavaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaBean pessoaBean = new PessoaBean();
		
		pessoaBean.setNome("João");
		pessoaBean.setIdade(27);
		
		System.out.println(pessoaBean.getNome() + " Tem " + pessoaBean.getIdade() + " Anos");

	}

}
