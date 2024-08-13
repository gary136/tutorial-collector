package com.hibernate.Demo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
//@Table(name = "alien_table")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	
	@Id
	private int aid;
//	@Transient
	private String name;
//	private AlienName name;
//	@Column(name="alien_color")
	private String color;
	
//  lazy
//	@ManyToMany(mappedBy="aliens")
//	eager
//	@ManyToMany(mappedBy="aliens", fetch = FetchType.EAGER)
//	private List<Laptop> laptops = new ArrayList<Laptop>();
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
//	public AlienName getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public void setName(AlienName name) {
//		this.name = name;
//	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//	public List<Laptop> getLaptops() {
//		return laptops;
//	}
//	public void setLaptops(List<Laptop> laptops) {
//		this.laptops = laptops;
//	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
}
