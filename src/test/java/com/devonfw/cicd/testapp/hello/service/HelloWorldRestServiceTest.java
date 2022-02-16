package com.devonfw.cicd.testapp.hello.service;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HelloWorldRestServiceTest {

  @Test
  public void testHelloEndpoint() {

    given().when().get("/hello").then().statusCode(200).body(is("Hello World"));
  }

  @Test
  public void testHelloNameEndpoint() {

    given().when().get("/hello/Florian").then().statusCode(200).body(is("Hello Florian!"));
  }

}