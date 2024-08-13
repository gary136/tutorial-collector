package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
//		assertEquals("Java", "Java");
		Calc c = new Calc();
		int act = c.divide(10, 5);
		int expc = 2;
		assertEquals(expc, act);
	}

}
