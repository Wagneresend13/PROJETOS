package VideoPolimorfismoYoutube_2;

public class PessoaFisica extends TaxPayer {
	
	private Double gastosComSaude;
	
	PessoaFisica(){
	
	}
	
	PessoaFisica(String nome , Double rendaAnual , Double gastosComSaude){
		super(nome,rendaAnual); // Implementando os argumentos da Super ( TaxPayer )
		this.gastosComSaude = gastosComSaude;		
	}
	
	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double tax() {

// utilizando if ternário para condição " se " , "não "
//double basictax1 = (this.getRendaAnual() < 20000.0) ? this.getRendaAnual() * 15.0 / 100 : this.getRendaAnual() * 25.0 / 100.0; 
		
	double basicTax; 
		
	if(this.getRendaAnual() < 20000.0) {
		basicTax = this.getRendaAnual() * 15.0 / 100.0;
	}else {
		basicTax = this.getRendaAnual() * 25.0 / 100.0;
	}
	
	basicTax = basicTax - (this.getGastosComSaude() * 0.5);
	
	if(basicTax < 0) {
		return 0.0;
	}else {
		return basicTax;
		}

	}

}
