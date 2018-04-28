package com.howtoprogram.junit5.observablepractice;

import com.howtoprogram.junit5.observablepractice.DemoObservables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions.*;

public class DemoObservableTest {
	
	int[]arrNumbers = {1,5,10,20};
	int[] testList = {};
	
	@Test
	@DisplayName("Should Greater Than Ten")
	void shouldGreatrThanTen() {
		int[] listExpected = {20};
		int[] result = DemoObservables.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should Duplicate")
	void shouldDuplicate() {
		int[] listExpected = {2,10,20,40};
		
		int[] result = DemoObservables.duplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected, result);
	}
	
	@Test
	@DisplayName("Should Validate Empty Array Duplicate")
	void shouldValidateEmptyArrayDuplicate() {
		int[] listExpected = {};
		
		int[] result = DemoObservables.getGreaterThanTen(arrNumbers); 
		assertArrayEquals(listExpected, result);
	}
	
	@Test
	@DisplayName("Should Validate Empty Greater Than Ten")
	void shouldValidateEmptyGreaterThanTen() {
		int[] listExpected = {20};
		int[] result = DemoObservables.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
}
