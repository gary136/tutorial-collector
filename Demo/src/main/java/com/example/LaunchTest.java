package com.example;

public class LaunchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		int res1 = t.divide(10, 5);
		if (res1 == 2) {
			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");
		}
		int res2 = t.divide(10, 0);
		if (res2 == 2) {
			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");
		}
	} 

}
