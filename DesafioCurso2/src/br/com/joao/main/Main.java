package br.com.joao.main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero = new Scanner(System.in);
		System.out.println("digite o numero : ");
		int n = numero.nextInt();
		
		if(n /2 == 1) 
			System.out.println("numero impar");
			else {
				if (n >= 2 && n <= 5)
					System.out.println("A");
				else if (n >=6 && n<= 20)
					System.out.println("B");
				else
					System.out.println("C");
			}
	}
}
