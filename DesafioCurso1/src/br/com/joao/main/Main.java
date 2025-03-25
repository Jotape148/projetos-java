package br.com.joao.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner Numero1 = new Scanner(System.in);
		System.out.println ("Digite o primeiro numero: ");
		int x = Numero1.nextInt();
		
		
		Scanner Numero2 = new Scanner(System.in);
		System.out.println ("Digite o segundo numero: ");
		int y = Numero2.nextInt();
		
		
		Scanner Numero3 = new Scanner(System.in);
		System.out.println ("Digite o terceiro numero: ");
		int z = Numero3.nextInt();
		
		
		System.out.println ("os numeros sao : ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
