package br.com.joao.forma.area;

import br.com.joao.IArea.*;

public class Circulo implements AreaCalculavel{
	
	 private double raio;

	    public Circulo(double raio) {
	        this.raio = raio;
	    }

	    @Override
	    public double calcularArea() {
	        return Math.PI * raio * raio;
	    }
	}
