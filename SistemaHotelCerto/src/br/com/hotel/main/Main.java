package br.com.hotel.main;
import br.com.hotel.quartos.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------simples------------------");
		QuartoSimples objQuartoSimples = new QuartoSimples("Solteiro", true);
		objQuartoSimples.infos();
		double valorReservaSimples = objQuartoSimples.calcularValor(5, 100);
		System.out.println("Valor total da reserva: "+valorReservaSimples);
		
		System.out.println("-----------------luxo------------------");
		QuartoLuxo objQuartoLuxo = new QuartoLuxo("Casal",true,true);
		objQuartoLuxo.infos();
		double valorReservaLuxo = objQuartoLuxo.calcularValor(7, 500);
		System.out.println("Valor total da reserva: "+valorReservaLuxo);
		
		System.out.println("----------------presidencial------------------");
		SuitePresidencial objSuitePresidencial = new SuitePresidencial("king size", true, true, true);
		objSuitePresidencial.infos();
		double valorReservaPresidencial = objSuitePresidencial.calcularValor(15,2500);
		System.out.println("Valor total da reserva: "+valorReservaPresidencial);

	}

}
