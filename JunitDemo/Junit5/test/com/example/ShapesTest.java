package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes shape = new Shapes();

	@Test
	void testcomputeSquareArea() {
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	@Test
	void testcomputecircleArea() {
		assertEquals(576, shape.computeCircleArea(10), "Area of CircleCalculation is wrong");
	}

}
