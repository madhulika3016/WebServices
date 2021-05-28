package com.WSFirst1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	
	List<Student> ls;
	
	public List<Student>  getS()
	{
		ls=new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(101);
		s1.setSname("Ruhi");
		s1.setTech("Java");
		
		Student s2=new Student();
		s2.setId(102);
		s2.setSname("Juhi");
		s2.setTech("AI");
		
		Student s3=new Student();
		s3.setId(103);
		s3.setSname("Mahi");
		s3.setTech("PHP");
		
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);	
		return ls;
	}
	public void create(Student s) {
		ls.add(s);		
	}
	
	public void delete(Student s)
	{
		ls.remove(s.getId());
	}
 
}
