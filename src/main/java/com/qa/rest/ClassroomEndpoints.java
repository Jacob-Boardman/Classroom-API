package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.service.ClassroomServiceImplementaion;

@Path("/classroom")
public class ClassroomEndpoints {
	
	@Inject
	private ClassroomServiceImplementaion service;
	
	@Path("/getAllClassrooms")
	@GET
	@Produces({"application/json"})
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}
	
	@Path("/createClassroom")
	@POST
	@Produces({"application/json"})
	public String createClassroom(String trainee) {
		return service.createClassroom(trainee);
	}
	
	@Path("/updateClassroom/{id}")
	@PUT
	@Produces({"application/json"})
	public String updateClassroom(@PathParam("id") Long id, String trainee) {
		return service.updateClassroom(id, trainee);
	}

	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces({"application/json"})
	public String deleteClassroom(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}

}
