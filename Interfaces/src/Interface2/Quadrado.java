package Interface2;

public class Quadrado implements FigurasGeometricas{
	
	
	Double lado;
	

	Quadrado(){
		
	}
	
	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	Quadrado(Double lado){
		
		this.lado = lado;
		
	}
	
	
	

	@Override
	public Double calcularFiguraGeometrica() {
		
		Double resultado;
		
		resultado = this.getLado() * this.getLado();
		
		System.out.println(" O resultado do c?lculo do quadrado = " + resultado);
		
		
		return resultado;
	}




}
