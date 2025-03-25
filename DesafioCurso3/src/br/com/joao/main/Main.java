package br.com.joao.main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double num1 = s.nextDouble();
		char op = s.next().charAt(0);
		double num2 = s.nextDouble();
		
		if(op == '+')
			System.out.println((int)num1 + num2);
		else if(op == '-')
			System.out.println((int)num1 - num2);
		else if(op == '*')
			System.out.println((int)num1 * num2);
		else if(op == '/')
			System.out.println((int)num1 / num2);
		else
			System.out.println("Formato errado");		
		
	}

}
