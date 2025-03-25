package br.com.joao.main;

import br.com.joao.animal.Animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal objGato = new Animal("Gato","Persa");
		objGato.emitirSom("Miau!!!");
		
		System.out.println("=================================================");
		
		Animal objCao = new Animal("Cachorro","Caramelo");
		objCao.emitirSom("Auau!!!!");
		

	}

}
