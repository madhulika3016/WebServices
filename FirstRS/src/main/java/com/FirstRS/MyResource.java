package com.FirstRS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/all")
public class MyResource {

	StudentRepo repo=new StudentRepo();

    @GET
    @Path(value = "students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudent() {
    
        return repo.getStudents();
    }
    
	/*
	 * @GET
	 * 
	 * @Path("emps")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public List<Employee> getEmps() {
	 * 
	 * Employee e1=new Employee(); e1.setEid(101); e1.setEname("HIna");
	 * e1.setSalary(30000);
	 * 
	 * Employee e2=new Employee(); e2.setEid(102); e2.setEname("TIna");
	 * e2.setSalary(40000);
	 * 
	 * Employee e3=new Employee(); e3.setEid(103); e3.setEname("Nina");
	 * e3.setSalary(35000);
	 * 
	 * List<Employee> le=new ArrayList();
	 * 
	 * le.add(e1); le.add(e2); le.add(e3); return le; }
	 */
    
	/*
	 * @POST
	 * 
	 * @Path("/add") public Response addStudent(@FormParam(value = "sid") int
	 * sid,@FormParam(value = "sname") String sname,
	 * 
	 * @FormParam(value = "tech") String tech) { Student s4=new Student();
	 * s4.setSid(sid); s4.setSname(sname); s4.setTech(tech);
	 * 
	 * repo.create(s4);
	 * 
	 * System.out.println(s4.getSid()+"   "+s4.getSname()+"  "+s4.getTech());
	 * 
	 * return Response.status(200).entity("Student Added").build();
	 * 
	 * }
	 */
    
    @GET
    @Path(value = "student/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Student getStudent(@PathParam(value = "id") int id) {
    	Student s1 = null;
    	List<Student> l=repo.getStudents();
    	for(Student s:l)
    	{
    	if(s.getSid()==id)
    		
    	{
    		 return s;
    	}
    	else
    		s1=null;
    	}		
   return s1;
   
    } 
    
    @POST
    @Path("/addstudent")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Student> addStudent1(Student s)
    {
    	repo.create(s);
    	
    	List<Student> l=repo.getStudents();
    	
    	System.out.println(s.getSid()+"   "+s.getSname()+"  "+s.getTech());
    	
		return l;
    	
    }
    
    
}
