package com.WSFirst1;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("student")
public class MyResource {
	
	StudentRepository repo=new StudentRepository();

	@Path("getS")
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Student>  getStudent() {
		//System.out.println(repo.getS());
       return repo.getS();
    }
	@Path("createS")
	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student CreateStudent(Student  s)
	{
		System.out.println(s);
		repo.create(s);
		return s;
	}
	
	@Path("deleteS")
	@DELETE
	public void deleteStudent(Student s)
	{
		System.out.println(s);
		repo.delete(s);
		
	}
	
}
