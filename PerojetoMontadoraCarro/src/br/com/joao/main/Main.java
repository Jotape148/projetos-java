package br.com.joao.main;

import br.com.joao.veiculo.Veiculo;

public class Main {

	public static void main(String[] args) {
		// tirar o carro da forma (instanciar)
		
		Veiculo objVeiculo1 = new Veiculo("Fiat","Uno",1995, 50000);
		objVeiculo1.acelerar();
		objVeiculo1.infos();
		objVeiculo1.valor();
		
		
		Veiculo objVeiculo2 = new Veiculo("Chevrolet","Opala",1968, 60000);
		objVeiculo2.acelerar();
		objVeiculo2.freiar();
		objVeiculo2.infos();
		objVeiculo2.valor();
	

	}

}
