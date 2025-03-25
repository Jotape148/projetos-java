package br.com.hotel.quartos;

public class Quarto{
	
	private int numero_quarto;
	private int andar;
	private String bloco;
	private int qtd_noite;
	private String servicos;
	
	public Quarto(int numero_quarto, int andar, String bloco, int qtd_noite, String servicos) {
		super();
		this.numero_quarto = numero_quarto;
		this.andar = andar;
		this.bloco = bloco;
		this.qtd_noite = qtd_noite;
		this.servicos = servicos;	
	}
	
	public int getNumero_andar() {
		return numero_quarto;
	}
	public void setNumero_andar(int numero_quarto) {
		this.numero_quarto = numero_quarto;
	}
	
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	
	public int getQtd_noite() {
		return qtd_noite;
	}
	public void setQtd_noite (int qtd_noite) {
		this.qtd_noite = qtd_noite;
	}
	
	public String getServicos() {
		return servicos;
	}
	public void serServicos(String servicos) {
		this.servicos = servicos;
	}
	
	public void exibirInfos() {
		System.out.println("Quantidade de noite: "+qtd_noite);
		System.out.println("Bloco do quarto: "+bloco);
		System.out.println("Andar do quarto: "+andar);
		System.out.println("Numero do quarto: "+numero_quarto);
		System.out.println("Servicos disponiveis: "+servicos);
	}
	
	
	
	

}
