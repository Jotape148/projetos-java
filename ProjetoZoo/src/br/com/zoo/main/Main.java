package br.com.zoo.main;

import br.com.zoo.animal.Mamifero;
import br.com.zoo.animal.Aves;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero objMamifero = new Mamifero("Macaco","Macaco-aranha","floresta", "Carnivoro","Sim", "Nao");
		objMamifero.exibirInfos();
		objMamifero.temPelos();
		objMamifero.temPresas();
		objMamifero.fazerSom();
		
		System.out.println("===================================");
		
		Aves objAves = new Aves("Coruja","Jacurutu","Floresta","Branca","entre 43 e 52 mm","Carnivora");
		objAves.exibirInfos();
		objAves.corPena();
		objAves.tamanhoBico();
		objAves.fazerSom();
		

	}

}
