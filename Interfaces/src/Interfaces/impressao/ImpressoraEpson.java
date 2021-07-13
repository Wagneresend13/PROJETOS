package Interfaces.impressao;



public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("**********");
		System.out.println(imprimivel.getCabecaPagina());
		System.out.println("**********");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("------------------");
		System.out.println("     EPSON     ");
	}

}
