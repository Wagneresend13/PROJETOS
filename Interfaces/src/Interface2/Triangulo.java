package Interface2;

public class Triangulo implements FigurasGeometricas{

	Double valorBase;
	Double valorAltura;
	
	Triangulo(){
		
	}
	
	Triangulo(Double valorBase, Double valorAltura){
		this.valorAltura = valorAltura;
		this.valorBase = valorBase;
		
		}
	

	
	public Double getValorBase() {
		return valorBase;
	}

	public void setValorBase(Double valorBase) {
		this.valorBase = valorBase;
	}

	public Double getValorAltura() {
		return valorAltura;
	}

	public void setValorAltura(Double valorAltura) {
		this.valorAltura = valorAltura;
	}
	
	

	@Override
	public Double calcularFiguraGeometrica() {
	
		Double resultado;
		
		resultado = (this.getValorAltura() * this.valorBase) / 2 ;
		
		System.out.println(" Valor resultado do triângulo " + resultado);
		
		
		return resultado;
	}

	
	
	
	
}
