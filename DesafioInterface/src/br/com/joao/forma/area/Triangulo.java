package br.com.joao.forma.area;

import br.com.joao.IArea.*;

public class Triangulo implements AreaCalculavel{
	
	private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
