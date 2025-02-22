package com.hibernate.Demo;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
//	@OneToOne
//	private Laptop laptop;
//	@OneToMany
//	@ManyToMany(mappedBy="students")
	@ManyToMany
	private List<Laptop> laptops = new ArrayList<Laptop>();
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
