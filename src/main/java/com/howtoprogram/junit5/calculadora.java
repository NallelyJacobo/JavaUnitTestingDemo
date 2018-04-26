package com.howtoprogram.junit5;


public class calculadora {
	
	int numero1;
	int numero2;
	int resultado;
	
	public int suma(int numero1, int numero2) {
		resultado = numero1 + numero2;
		return resultado;
	}
	
	public int resta(int numero1, int numero2) {
		resultado = numero1 - numero2;
		return resultado;
	}
	
	public int multiplicacion(int numero1, int numero2) {
		resultado = numero1 * numero2;
		return resultado;
	}
	
	public int divicion(int numero1, int numero2) {
		resultado = numero1 / numero2;
		return resultado;
	}

}