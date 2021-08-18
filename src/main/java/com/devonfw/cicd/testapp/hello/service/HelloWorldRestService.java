package com.devonfw.cicd.testapp.hello.service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.devonfw.cicd.testapp.hello.logic.HelloWorldManagement;

/**
 * HelloWorld REST endpoint.
 *
 */
@Path("/hello")
public class HelloWorldRestService {

  @Inject
  HelloWorldManagement helloWorldManagement;

  /**
   * Returns the String "Hello world!".
   *
   * @return The String "Hello world!".
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String hello() {

    return this.helloWorldManagement.helloWorld();
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

    return this.helloWorldManagement.helloName(name);
  }

}