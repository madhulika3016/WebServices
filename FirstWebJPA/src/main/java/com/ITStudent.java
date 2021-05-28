package com;

import javax.persistence.Entity;

@Entity
public class ITStudent extends Student1{

	private int fees;
	
	private int labtime;

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getLabtime() {
		return labtime;
	}

	public void setLabtime(int labtime) {
		this.labtime = labtime;
	}
	
	
}
