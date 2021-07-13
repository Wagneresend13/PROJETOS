package VideoPolimorfismoYoutube_2;

public class PessoaJuridica extends TaxPayer {
	
	private Integer numero_funcionarios;
	
	PessoaJuridica(){		
	}
	
	PessoaJuridica(String nome , Double rendaAnual , Integer numero_funcionarios ){
		super(nome , rendaAnual);
		this.numero_funcionarios = numero_funcionarios;
		
	}

	public Integer getNumero_funcionarios() {
		return numero_funcionarios;
	}

	public void setNumero_funcionarios(Integer numero_funcionarios) {
		this.numero_funcionarios = numero_funcionarios;
	}

	@Override
	public double tax() {
		
	double basicTaxPessoaJuridica;
	
	if(this.numero_funcionarios > 10) {
		basicTaxPessoaJuridica =  this.getRendaAnual() * 14.0 / 100;
	}else {
		basicTaxPessoaJuridica = this.getRendaAnual() * 16.0 / 100;
	}
	
	
	if(basicTaxPessoaJuridica < 0) {
		return 0.0;
	}else {
		return basicTaxPessoaJuridica;
		}	
	}
}
