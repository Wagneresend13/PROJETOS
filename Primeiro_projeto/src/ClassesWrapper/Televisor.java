package ClassesWrapper;

public class Televisor {
	
	Integer canal = 130;
	Integer volume = 20;
	
	void mudarCanal(Integer novoCanal) {
		
		if(canal.equals(novoCanal)) {
			System.out.println(" Novo canal já é o canal Atual ");
		}else {
			canal.equals(novoCanal);
			System.out.println("Realizado atualização do novo canal com sucesso");
		}
				
	}
	
	void mudarVolume(Integer novoVolume) {
		
		if(volume.equals(novoVolume)) {
			System.out.println("Novo volume já é o volume Atual");
			
		}else {
			volume.equals(novoVolume);
			System.out.println(" Volume atualizado com sucesso");
		}
		
	}
	
	

}