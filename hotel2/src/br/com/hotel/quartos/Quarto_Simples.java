package br.com.hotel.quartos;

public class Quarto_Simples extends Quarto{
	
	private int qtd_camas;
	private int preco_simples = 250;

	public Quarto_Simples(int numero_quarto, int andar, String bloco, int qtd_noite, String servicos,
			int qtd_camas, int preco_simples) {
		super(numero_quarto, andar, bloco, qtd_noite, servicos);
		this.qtd_camas = qtd_camas;
		this.preco_simples = preco_simples;
	}
	
	public void exibirInfos() {
		super.exibirInfos();
		System.out.println("Escolha quantas camas? "+ qtd_camas);
		System.out.println("Preco Quarto simples por noite " +preco_simples);
	}
	

}
