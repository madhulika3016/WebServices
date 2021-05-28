package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			PrintWriter out=response.getWriter();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("Connected");
		
		/*
		 * User22 user2=new User22();
		 * 
		 * String username=request.getParameter("uname"); String
		 * Pass=request.getParameter("pass");
		 * 
		 * //user2.setUserid(1010); user2.setUsername(username); user2.setPass(Pass);
		 * 
		 * em.persist(user2);
		 */
		
		Student1 s1=new Student1();
		s1.setSname("Rina");
		s1.setCourse("java");
		
		Student1 s2=new Student1();
		s2.setSname("Tina");
		s2.setCourse(".Net");
		
		Student1 s3=new Student1();
		s3.setSname("Hina");
		s3.setCourse("PHP");
		
		List<Student1> ls=new ArrayList<Student1>();
 		ls.add(s1);
 		ls.add(s2);
 		ls.add(s3);
 		
 		Book  b1=new Book();
 		b1.setBname("Java2 complete reference");
 		b1.setStudent(ls);
 		
 		Book  b2=new Book();
 		b2.setBname("Let us C");
 		b2.setStudent(ls);
 		Book  b3=new Book();
 		b3.setBname("Java DS & ALGO");
 		b3.setStudent(ls);
 		List<Book> lb=new ArrayList<Book>();
 		lb.add(b1);
 		lb.add(b2);
 		lb.add(b3);
 		s1.setBook(lb);
 		s2.setBook(lb);
 		s3.setBook(lb);
 		
 		//em.persist(b1);
 		//em.persist(b2);
 		//em.persist(b3);
 		em.persist(s1);
 		em.persist(s2);
 		em.persist(s3);
 		
 		
 		ITStudent si1=new ITStudent();
 		si1.setSname("Ajay");
 		si1.setCourse("Java");
 		si1.setFees(20000);
 		si1.setLabtime(120);
 		
 		em.persist(si1);
 		
		
		em.getTransaction().commit();
		
		/*
		 * Student1 s4=em.find(Student1.class,3);
		 * 
		 * System.out.println(s4.getSname());
		 * 
		 * s4.setSname("Nina");
		 * 
		 * System.out.println(s4.getSname());
		 */
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
