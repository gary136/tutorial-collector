package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int age;
//	private Laptop laptop;
	private Computer com;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
//	@Autowired
//	Laptop laptop = new Laptop();

//	public Alien() {
//		System.out.println("Alien Object Created...");
//	}

//	public Alien(int age) {
//		this.age = age;
//	}

	public void code() {
		System.out.println("I'm coding...");
//		laptop.compile();
		com.compile();
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
} 
