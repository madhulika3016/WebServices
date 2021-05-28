package com.WSJPA1;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("coder")
public class MyResource {

	CoderRepo repo=new CoderRepo();
    @GET
    @Path(value = "getall")
    @Produces(MediaType.APPLICATION_XML)
    public List<Coder> getall() {
    	repo.getConnection();
        List<Coder> ls=repo.getCoder();
        return ls;
    }
    
    @POST
    @Path(value = "savec")
    @Consumes(MediaType.APPLICATION_XML)
    public Coder savec(Coder c)
    {
    	repo.getConnection();
    	Coder c1=new Coder();
    	c1=c;
    	System.out.println(c1.getCid());
    	repo.saveCoder(c1);
    	
    	return c1;
    }
    
    @DELETE
    @Path(value = "deletec/{id}")
    //@Consumes(MediaType.APPLICATION_XML)
    public String deletecoder(@PathParam(value = "id") int id)
    {
    	repo.getConnection();
    	
    	repo.deleteCoder(id);
    	
    	return "deleted";
    }
    
    @PUT
    @Path(value = "updatec/{id}")
    //@Consumes(MediaType.APPLICATION_XML)
    public String updatec(@PathParam(value = "id") int id)
    {
    	repo.getConnection();
    	
    	repo.updateCoder(id);
    	
    	return "Record Updated";
    }
    
    @PUT
    @Path(value = "updatecoder")
    @Consumes(MediaType.APPLICATION_XML)
    public Coder updatec(Coder c)
    {
    	repo.getConnection();
    	
    	repo.updateCoder1(c);
    	
    	return c;
    }
}
