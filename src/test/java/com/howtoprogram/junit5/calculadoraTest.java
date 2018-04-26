package com.howtoprogram.junit5;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class calculadoraTest {
	
	private calculadora calculadoraTest;
	
	@Test
	@DisplayName("Prueba suma")
	void calculadoraSuma() {
		calculadoraTest = mock(calculadora.class);
		//int expectedSuma = 12;
		 when(calculadoraTest.suma(9, 3)).thenReturn(12);
		 //assertEquals(expectedSuma, calculadoraTest.suma(9,3));
	}
	
	@Test
	@DisplayName("Prueba resta")
	void calculadoraResta() {
		calculadoraTest = mock(calculadora.class);
		//int expectedResta = 6;
		when(calculadoraTest.resta(9, 3)).thenReturn(6);
		//assertEquals(expectedResta, calculadoraTest.resta(9, 3));
	}
	
	@Test
	@DisplayName("Prueba mutiplicacion")
	void calculadoraMultiplicacion() {
		calculadoraTest = mock(calculadora.class);
		//int expectedMultiplicacion = 27;
		when(calculadoraTest.multiplicacion(9, 3)).thenReturn(27);
		//assertEquals(expectedMultiplicacion, calculadoraTest.multiplicacion(9, 3));
	}
	
	@Test
	@DisplayName("Prueba divicion")
	void calculadoraDivicion() {
		calculadoraTest = mock(calculadora.class);
		//int expectedDivicion = 3;
		when(calculadoraTest.divicion(9, 3)).thenReturn(3);
		//assertEquals(expectedDivicion, calculadoraTest.divicion(9,3));
	}
	
}