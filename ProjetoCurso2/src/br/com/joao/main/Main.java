package br.com.joao.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        //imprimir normal
        System.out.println(Arrays.toString(my_array1)+" esta normal");
        //muda pra colocar em ordem
        Arrays.sort(my_array1);
        //imprime em ordem crescente
        System.out.println(Arrays.toString(my_array1)+" esta em ordem");
        
        System.out.println("---------------");
      //imprimir normal
        System.out.println(Arrays.toString(my_array2)+" esta normal");
        //muda pra colocar em ordem
        Arrays.sort(my_array2);
        //imprime em ordem alfabetica
        System.out.println(Arrays.toString(my_array2)+" esta em ordem");
        
	}

}
	