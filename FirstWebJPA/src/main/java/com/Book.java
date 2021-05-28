package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book123")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String bname;
	
	@ManyToMany(mappedBy = "book")
	List<Student1> student;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<Student1> getStudent() {
		return student;
	}

	public void setStudent(List<Student1> student) {
		this.student = student;
	}
	
	

}
