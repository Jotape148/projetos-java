package br.com.honda.main;

import br.com.honda.veiculo.Carro;
import br.com.honda.veiculo.Moto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro objCarro = new Carro("Tesla","Cyber Truck", "Chumbo", 50, 5);
		objCarro.acelerar();
		objCarro.freiar();
		objCarro.capota();
		
		System.out.println("==================================");
		
		Moto objMoto = new Moto("BMW", "B1000", "Branca", "Titanio", "CR288");
		objMoto.acelerar();
		objMoto.freiar();
		objMoto.cair();
		

	}

}
