package com.howtoprogram.junit5.observablepractice;

import com.howtoprogram.junit5.observablepractice.DemoObservables2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DemoObservable2Test {
	
	Integer[]arrNumbers = {1,5,10,20};
	Integer[]testList = {};
	
	@Test
	@DisplayName("Should Greater Than Ten")
	void shouldGreaterThanTen() {
		Integer[] listExpected = {20};
		Integer[] result = DemoObservables.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected, result);
	}

}
