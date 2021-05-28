package com.JPAMapDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Laptop {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String company;
	private String model;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", company=" + company + ", model=" + model + "]";
	}
	
	
	
	

}
