package com.howtoprogram.junit5.Examen;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {
	
	
	String[] resultado = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
	
	@Test
	@DisplayName("Prueba FizzBuzz")
	void FizzBuzz() {
		
		FizzBuzz fbt = mock(FizzBuzz.class);
		when(fbt.FizzBuzz(1, 15)).thenReturn(resultado);
	}
	
}
