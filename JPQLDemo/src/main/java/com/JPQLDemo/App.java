package com.JPQLDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        System.out.println( "Connected...." );
        
        Employee e1=new Employee();
        //e1.setEid(1004);
        e1.setEname("Raj");
        e1.setDept("IT");
        e1.setSalary(30000);
        
        em.persist(e1);
        
        Employee e2=new Employee();
        //e2.setEid(1005);
        e2.setEname("GARIMA");
        e2.setDept("AC");
        e2.setSalary(45000);
        
        em.persist(e2);
        
        Employee e3=new Employee();
       // e3.setEid(1006);
        e3.setEname("AMY");
        e3.setDept("FI");
        e3.setSalary(70000);
        
        em.persist(e3);
        
        Query  q=em.createQuery("select e from Employee e");
        
        List<Employee> list=q.getResultList(); 
        
        System.out.println("Employee data");
        
        for(Employee e:list)
        {
        	System.out.println(e);
        }
        
Query  q1=em.createQuery("select e.ename from Employee e");
        
        List<String> list1=q1.getResultList(); 
        
        System.out.println("Employee Name");
        
        for(String s:list1)
        {
        	System.out.println(s);
        }
        
        Query  q2=em.createQuery("select count(e) from Employee e");
        
        System.out.println("Number of employees is "+q2.getSingleResult());
        
 Query  q3=em.createQuery("select max(e.salary) from Employee e");
        
        System.out.println("Maximum salary of employees is "+q3.getSingleResult());
        
Query  q4=em.createQuery("update Employee set salary=50000 where eid>1002");
					q4.executeUpdate();
        
        System.out.println("Record updated");
        
        Query  q5=em.createQuery("delete from  Employee  where eid>1002");
		q5.executeUpdate();
		System.out.println("Record deleted");
		
		Query qu=em.createNamedQuery("qq");
		qu.executeUpdate();
		System.out.println("Record Inserted");
		
		
		
        
        em.getTransaction().commit();
    }
}
