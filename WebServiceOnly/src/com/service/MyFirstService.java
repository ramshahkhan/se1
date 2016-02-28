package com.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.model.Message;

@Path("/service")
public class MyFirstService {

	@GET
	@Path("/produce/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJson(@PathParam("param") String msg) {

		final Message message = new Message(msg);

		return Response.status(200).entity(message).build();

	}
	
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Your Web-Service Says: " + msg;

		return Response.status(200).entity(result).build();

	}

}
