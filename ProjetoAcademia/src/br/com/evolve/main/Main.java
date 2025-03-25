package br.com.evolve.main;

import br.com.evolve.instrutores.Instrutores;

import java.util.Scanner;

import br.com.evolve.aulas.Aulas;

public class Main {

	public static void main(String[] args) {
		//insttutores
		Instrutores objInstrut1 = new Instrutores("joao", 19, "masculino", "recepcionista");
		
		System.out.println(objInstrut1.nome());
		System.out.println(objInstrut1.idade());
		System.out.println(objInstrut1.sexo());
		System.out.println(objInstrut1.funcao());
		
		Aulas objAulas1 = new Aulas("Jiujitsu", "turma das 18", "joao");
		System.out.println(objAulas1.modalidade());
		System.out.println(objAulas1.horario());
		System.out.println(objAulas1.professor());
		
		

	}

}
