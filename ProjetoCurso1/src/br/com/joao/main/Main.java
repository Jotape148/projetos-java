package br.com.joao.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner NumeroScanner = new Scanner(System.in);
		System.out.println ("Digite o primeiro numero: ");
		byte x = NumeroScanner.nextByte();
		System.out.println (x);
		
		Scanner NumeroScanner2 = new Scanner(System.in);
		System.out.println ("Digite o segundo numero: ");
		byte y = NumeroScanner2.nextByte();
		System.out.println (y);
		
		int calculando = x + y;
		System.out.println(calculando +" e o resultado");
		

	}

}
