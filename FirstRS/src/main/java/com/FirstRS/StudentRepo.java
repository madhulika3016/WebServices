package com.FirstRS;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
	
	List<Student> ls;
	public StudentRepo()
	{
		ls=new ArrayList<Student>();
		Student s1=new Student();
    	s1.setSid(101);
    	s1.setSname("madhu");
    	s1.setTech("Java");
    	
    	Student s2=new Student();
    	s2.setSid(102);
    	s2.setSname("madhuri");
    	s2.setTech("PHP");
    	
    	Student s3=new Student();
    	s3.setSid(103);
    	s3.setSname("Sheetal");
    	s3.setTech("AI");
    	
    	ls.add(s1);
    	ls.add(s2);
    	ls.add(s3);
	}
	public List<Student> getStudents()
	{
		return ls;
	}
	public void create(Student s) {
		ls.add(s);
	}



}
