package br.com.hotel.main;
import br.com.hotel.quartos.Quarto;
import br.com.hotel.quartos.Quarto_Simples;
import br.com.hotel.quartos.Quarto_luxo;
import br.com.hotel.quartos.Suite_presidencial;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quarto_Simples objQuartoS = new Quarto_Simples(32, 3, "c", 4, "sem servicos", 4, 250);
		objQuartoS.exibirInfos();
		
		System.out.println("------------------------------------");
		
		Quarto_luxo objQuartoL = new Quarto_luxo(32, 3 ,"A",4 , "cafe incluso", 600);
		objQuartoL.exibirInfos();
		
		System.out.println("------------------------------------");
		
		Suite_presidencial objQuartoP = new Suite_presidencial(54, 4, "B", 4, "spa e cafe incluso", 1200);
		objQuartoP.exibirInfos();
	}

}
