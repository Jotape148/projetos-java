package br.com.bancosantander.conta;

public class Conta {
	
	//atributos (caracteristicas)
	private String nome;
	private int numero;
	private double saldo;
	
	//construtor inicializar os atributos da classe
	public Conta(String nome, int numero, double saldo) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//metodos (acoes)
	public double saldo() {
		
		return saldo;
	}
	
	public double sacar(double valorSaque) {
		
		return saldo -= valorSaque;
	}
	
	public double depositar(double valor) {
		
		return saldo += valor;
		
	}
	

}
