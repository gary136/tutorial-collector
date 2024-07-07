package com.hibernate.Demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
public class Laptop {
	@Id
	private int lid;
//	private String lName;
//	@ManyToOne
//	private Student student;
//	@ManyToMany
//	private List<Student> students = new ArrayList<Student>();
//	@ManyToMany
//	private List<Alien> aliens = new ArrayList<Alien>();
	private String brand;
	private int price;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
//	public String getlName() {
//		return lName;
//	}
//	public void setlName(String lName) {
//		this.lName = lName;
//	}
//	public List<Student> getStudents() {
//		return students;
//	}
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
//	public List<Alien> getAliens() {
//		return aliens;
//	}
//	public void setAliens(List<Alien> aliens) {
//		this.aliens = aliens;
//	}	

	public String getBrand() {
		return brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price + "]";
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
