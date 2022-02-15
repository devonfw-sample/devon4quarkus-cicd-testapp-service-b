package com.devonfw.cicd.testapp.hello.rest.v1;

import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.devonfw.cicd.testapp.hello.domain.UserEntity;
import com.devonfw.cicd.testapp.hello.domain.repo.UserRepository;

/**
 * HelloWorld REST endpoint.
 *
 */
@Path("/hello")
public class HelloWorldRestService {

  @Context
  UriInfo uriInfo;

  @Inject
  UserRepository userRepository;

  /**
   * Returns the String "Hello world!".
   *
   * @return The String "Hello world!".
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String hello() {

    Optional<UserEntity> optionalEntity = this.userRepository.findById(1L);
    if (optionalEntity.isPresent()) {
      UserEntity entity = optionalEntity.get();
      return entity.getFirstname() + " " + entity.getLastname();
    }
    return null;
  }

  @GET
  @Path("/user/{id}/")
  public String getUserById(@PathParam("id") long id) {

    Optional<UserEntity> optionalEntity = this.userRepository.findById(id);
    if (optionalEntity.isPresent()) {
      UserEntity entity = optionalEntity.get();
      return entity.getFirstname() + " " + entity.getLastname();
    }
    return id + " does not exists!";
  }

  /**
   * Return the String "Hello <<name>>!".
   *
   * @param name The name to greet.
   * @return The String "Hello <<name>>!".
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{name}")
  public String greeting(@PathParam String name) {

    return name;
  }

}