package br.com.hotel.quartos;

//Encapsulamento aqui As propriedades precoPorNoite e qtdNoites são protegidas
public abstract class Quartos {
    protected double precoPorNoite;
    protected int qtdNoites;
    
 // Herança quarto simples, de luxo e suite presidencial herdam a estrutura e os métodos da classe base Quarto.
    public Quartos(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public void setNumeroDeNoites(int qtdNoites) {
        this.qtdNoites = qtdNoites;
    }

    // Polimorfismo: O método calcularPrecoTotal vai ser implementado em cada tipo de quarto.
    public abstract double calcularPrecoTotal();
    
    public abstract String Servicos();
}

