package com.JPAMapDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        System.out.println( "Connected...." );
        
		/*
		 * Laptop l1=new Laptop(); l1.setCompany("Apple"); l1.setModel("Pro");
		 * 
		 * em.persist(l1);
		 * 
		 * Laptop l2=new Laptop(); l2.setCompany("Lenovo"); l2.setModel("Legion");
		 * em.persist(l2);
		 * 
		 * Emp e1=new Emp(); e1.setEname("Swetha"); e1.setSalary(40000);
		 * e1.setLaptop(l1);
		 * 
		 * em.persist(e1);
		 * 
		 * Emp e2=new Emp(); e2.setEname("Sneha"); e2.setSalary(45000);
		 * e2.setLaptop(l2);
		 * 
		 * em.persist(e2);
		 */
        
		/*
		 * Book b1=new Book(); b1.setBName("JAVA2 Complete reference");
		 * b1.setPrice(500);
		 * 
		 * 
		 * Book b2=new Book(); b2.setBName("DS & ALGO"); b2.setPrice(400);
		 * 
		 * Book b3=new Book(); b3.setBName("LET US C"); b3.setPrice(300);
		 * 
		 * List<Book> l1=new ArrayList(); l1.add(b1); l1.add(b2);
		 * 
		 * List<Book> l2=new ArrayList();
		 * 
		 * // l2.add(b2); l2.add(b3);
		 * 
		 * Student s1=new Student(); s1.setSname("Madhu"); s1.setCourse("JAVAFS");
		 * s1.setBook(l1); b1.setStudent(s1); b2.setStudent(s1); em.persist(b1);
		 * em.persist(b2); // em.persist(s1);
		 * 
		 * Student s2=new Student(); s2.setSname("Madhuri");
		 * s2.setCourse("PROGRAMMING"); s2.setBook(l2); b3.setStudent(s2);
		 * em.persist(b3); em.persist(s2);
		 */
        
        Employee e1=new Employee(); 
		e1.setEname("Neha"); 
		e1.setTech("JAVA");
		 em.persist(e1);
		 
		Employee e2=new Employee();
		e2.setEname("Puja"); 
		e2.setTech("JAVA");
		em.persist(e2);
		 
		Employee e3=new Employee(); 
		e3.setEname("Mina"); 
		e3.setTech("JAVA");
		em.persist(e3);
		
		
		  ITEmployee ite1=new ITEmployee(); 
		  ite1.setSalary(25000);
		  ite1.setEname("PUJA"); 
		  ite1.setTech("JAVA"); 
		  em.persist(ite1);
		  ITEmployee ite2=new ITEmployee(); 
		  ite2.setSalary(35000);
		  ite2.setEname("Neha"); 
		  ite2.setTech("AI"); 
		  em.persist(ite2);
		  
		  RetiredEmployee re1=new RetiredEmployee(); 
		  re1.setEname("Mahesh");
		  re1.setPension(20000); 
		  re1.setTech("C"); 
		  em.persist(re1);
		 
        
        em.getTransaction().commit();
    }
}
