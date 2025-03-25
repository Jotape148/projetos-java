package br.com.bancosantander.main;

import br.com.bancosantander.conta.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta objConta = new Conta("Joao", 001,002);
		
		System.out.println(objConta.saldo());
		
		System.out.println(objConta.sacar(32));
		
		System.out.println(objConta.depositar(62));
		

	}

}
