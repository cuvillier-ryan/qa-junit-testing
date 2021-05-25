package com.qa.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitCalculatorTest {
	
	@Test
	public void addTest(){
		int result = Calculator.add(12, 5);
		
		assertEquals(17, result);
	};
	
	@Test
	public void subtractTest(){
		int result = Calculator.subtract(12, 5);
		
		assertEquals(7, result);
	}
	
	@Test
	public void multiplyTest(){
		int result = Calculator.multiply(12, 5);
		
		assertEquals(60, result);
	}
	
	@Test
	public void divideTest(){
		double result = Calculator.divide(12, 5);
		
		assertEquals(2.4, result);
	}
}
