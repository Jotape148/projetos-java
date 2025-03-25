package br.com.joao.main;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner lerNumero = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		int numero = lerNumero.nextInt();
		System.out.println(numero);
		
		if (numero <9 && numero >= 1) {
			System.out.println("esse numero tem 1 digito ");
		}
		
		else if(numero > 10 && numero <=99) {
			System.out.println("esse numero tem 2 digitos ");
		}
		
		else if(numero > 100 && numero <=999) {
			System.out.println("esse numero tem 3 digitos ");
		}
		
		else if(numero > 999 && numero <=9999) {
			System.out.println("esse numero tem 4 digitos ");
		}
		
		else if(numero > 9999 && numero <=999999) {
			System.out.println("esse numero tem 5 digitos ou mais ");
		}
			

	}

}
