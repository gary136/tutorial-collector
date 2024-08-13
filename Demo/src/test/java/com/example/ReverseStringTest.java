package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString reverse = new ReverseString();
		String expc = "avaJ";
		assertEquals(expc, reverse.reversestring("Java"));		 
	}

}
