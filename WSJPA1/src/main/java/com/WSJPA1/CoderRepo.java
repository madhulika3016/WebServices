package com.WSJPA1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CoderRepo 
{
	EntityManagerFactory emf;
	EntityManager em;
	
	public void getConnection()
	{
		 emf=Persistence.createEntityManagerFactory("pu");
		
		 em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		/*
		 * Coder c1=new Coder(); c1.setCid(101); c1.setCname("Anupam");
		 * c1.setTech("PLM");
		 * 
		 * em.persist(c1);
		 */
		
		System.out.println("Connected to database");
		em.getTransaction().commit();
		
	}
	
	public List<Coder> getCoder()
	{
	Query  q=em.createQuery("select  c from Coder c");
	 List<Coder>  lc=q.getResultList();	
		
		return lc;
	}
	public Coder saveCoder(Coder c)
	{
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return c;
	}
	
	public String deleteCoder(int id)
	{
		
		em.getTransaction().begin();
		Coder c1=em.find(Coder.class,id);
		em.remove(c1);
		em.getTransaction().commit();
		return "deleted";
	}
	
	public String  updateCoder(int id)
	{
		em.getTransaction().begin();
		Query q=em.createQuery("update Coder c set c.cname=? where cid=id");
		q.setParameter(1,"kajal");
		q.executeUpdate();
		em.getTransaction().commit();
		return "Record Updated";
	}
	
	public String  updateCoder1(Coder c)
	{
		em.getTransaction().begin();
		Coder c1=em.find(Coder.class, c.getCid());
		c1.setCname(c.getCname());
		em.persist(c1);
		
		em.getTransaction().commit();
		return "Record Updated";
	}
}
