package com.JPAMapDemo;

import javax.persistence.Entity;

@Entity
public class ITEmployee extends Employee
{
	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
