package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse = new ReverseString();
		String expc = "avaJ";
		assertEquals(expc, reverse.reversestring("Java"));
		assertEquals("neilA", reverse.reversestring("Java"));
	}

}
