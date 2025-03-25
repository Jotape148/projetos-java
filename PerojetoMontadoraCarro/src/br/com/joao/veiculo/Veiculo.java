//pacote(organizar)
package br.com.joao.veiculo;
//forma(classe)
public class Veiculo {
	
	//caracteristicas (atributos,propriedades)
	private String marca;
	private String modelo;
	private int ano;
	private int valorOri;
	
	
	public Veiculo(String marca, String modelo, int ano, int valorOri) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorOri = valorOri;
	}
	
	//acoes(metodos)
	public void acelerar( ) {
		//comando para imprimir uma mensagem
		System.out.println(modelo+" acelerando..");
		
	}
	
	public void freiar() {
		System.out.println("carro freiando");
		
	}
	
	public void infos() {
		System.out.println("Marca :"+marca);
		System.out.println("Modelo :"+modelo);
		System.out.println("ano :"+ano);
	}
	
	public void valor() {
		System.out.println("Valor original: " + valorOri);
        System.out.println("Valor com 10% de acréscimo: " + (valorOri + (valorOri * 10 / 100)));;
		
		
	}

	
}
