package com.devonfw.cicd.testapp.hello.service;

import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.devonfw.cicd.testapp.hello.logic.Dto;
import com.devonfw.cicd.testapp.hello.logic.UserMapper;
import com.devonfw.cicd.testapp.hello.logic.User;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Path("/users")
@Produces("application/json")
@Consumes("application/json")
public class UserResource {

	@Inject
	UserMapper mapper;
	
	@Transactional
	@POST
	public Response create(Dto userDto) {
	    User user = mapper.fromResource(userDto);
	    ((PanacheEntityBase) user).persistAndFlush();
	    return Response.ok(mapper.toResource(user)).build();
	}
	
	@GET
	@Path("/{username}")
	public Response find(@PathParam("username") String username) {
	    return Optional.ofNullable(User.find("username", username))
	            .map(u -> Response.ok(mapper.toResource((User) u)))
	            .orElseGet(() -> Response.status(Response.Status.NOT_FOUND))
	            .build();
	}
	
}
