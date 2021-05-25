package com.qa.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BlackJackJunitTest {
	
	@Test
	public void play() {
		int result = BlackJack.play(21, 6);	
		
		
		assertEquals(0, result);
	}
	
	@Test
	public void playSuccessPlayer() {
		int result = BlackJack.play(22, 3);	
		
		
		assertEquals(3, result);
	}
	
	@Test
	public void playSuccessDealer() {
		int result = BlackJack.play(3, 22);	
		
		
		assertEquals(3, result);
	}
	

}
