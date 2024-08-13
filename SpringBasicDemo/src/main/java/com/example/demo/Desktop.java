package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("I'm compiling in a desktop...");
	}

}
