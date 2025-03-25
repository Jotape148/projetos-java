package br.com.joao.main;

import br.com.joao.forma.area.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo retangulo = new Retangulo(5, 4);
        Circulo circulo = new Circulo(3.14);
        Triangulo triangulo = new Triangulo(6, 3);

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }

	}
