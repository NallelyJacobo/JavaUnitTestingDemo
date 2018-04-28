package com.howtoprogram.junit5.Examen;

public class FizzBuzz {
	
	int inicio, fin;
	
	public String[] FizzBuzz(int inicio, int fin) {
		String resultado[];
		int num = 1;
		for(int i = inicio; i <= fin; i++) {
			num++;
		}
		resultado = new String[num];
		num = 0;
		for(int i = inicio; i <= fin; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				resultado[num] = "FizzBuzz";
				System.out.println(resultado[num]);
				num++;
			}else if(i % 3 == 0) {
				resultado[num] = "Fizz";
				System.out.println(resultado[num]);
				num++;
			}else if(i % 5 == 0) {
				resultado[num] = "Buzz";
				System.out.println(resultado[num]);
				num++;
			}else {
				resultado[num] = Integer.toString(i);
				System.out.println(resultado[num]);
				num++;
			}
		}
		return resultado;
	}
}