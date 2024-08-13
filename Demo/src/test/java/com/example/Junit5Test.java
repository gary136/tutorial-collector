package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Junit5Test {

//	@Test
//	void test() {
//		assertEquals(6, 6);
//	}
//	
//	@Test
//	void testComputeSquareArea() {
//		Shapes shape = new Shapes();
//		assertEquals(570, shape.computeSquareArea(24));
//	}
	
//	@Test
//	void testComputeCircleArea_Supplier() {
//		Shapes shape = new Shapes();
//		assertEquals(31, shape.computeCircleArea(10), () -> "Area of circle calculation is wrong");
//	}
	
//	@Test
//	void testArrays() {		
//		int[] act = {4, 6, 2, 8};
//		int[] expected = {2, 4, 6, 8};
//		Arrays.sort(act);
////		assertEquals(act, expected);
//		assertArrayEquals(act, expected);
//	}
	
////	test if exception to check is the exception that happens
//	@Test
//	void testSortingArrayException() {	
//		SortingArray arr = new SortingArray();
////		try {
////			int[] unsorted = {2, 1, 4, 3};
//////			int[] unsorted = null;
////			int[] sorted = arr.sortingArray(unsorted);
////			for (int elm : sorted) {
////				System.out.println(elm);
////			}
////			fail();
////		} catch (NullPointerException e) {
////			System.out.println("Exception generated");
////		}
//		
////		int[] unsorted = {2, 1, 4, 3};
//		int[] unsorted = null;
//		assertThrows(NullPointerException.class, () -> arr.sortingArray(unsorted));
//	}
	
//	@Test
//	void testSortingArrayPerformance() {	
//		SortingArray arr = new SortingArray();
//		int[] unsorted = {2, 1, 4, 3};
//		assertTimeout(Duration.ofMillis(10), () -> arr.sortingArray(unsorted));
//	}	

	public Junit5Test() {
		System.out.println("Test obj is created before test method");
	}
	@BeforeAll
//	static void beforeAll() {
	void beforeAll() {
		System.out.println("Before all test");
	}	

	Shapes shape;
	
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before test");
	}
	
	@Test
	void testComputeSquareArea() {
//		Shapes shape = new Shapes();
		assertEquals(576, shape.computeSquareArea(24));
		System.out.println("Actual Test Running");
	}
	
	@Test
	void testComputeCircleArea() {
//		Shapes shape = new Shapes();
		assertEquals(570, shape.computeSquareArea(10));
		System.out.println("Actual Test Running");
	}
	
	@AfterEach
	void destroy() {
		System.out.println("After a test running");
	}
	
	@AfterAll
//	static void afterAll() {
	void afterAll() {
		System.out.println("After all test");
	}
}
 