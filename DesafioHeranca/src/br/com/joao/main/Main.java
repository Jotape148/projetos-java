package br.com.joao.main;
import br.com.joao.veiculo.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro objCarro = new Carro("Tesla", "Model x", 2019 , 4 );
		objCarro.exibirInfos();
		objCarro.portas();
		
		System.out.println("-----------------------------------------");
		
		Moto objMoto = new Moto("Suziku", "Hayabusa", 2020, true);
		objMoto.exibirInfos();
		objMoto.automatico();
		
		System.out.println("-----------------------------------------");
		
		Caminhao objCaminhao = new Caminhao("Mercedes", "1718", 2009, 1500);
		objCaminhao.exibirInfos();
		objCaminhao.capacidadeDecarga();

	}

}
