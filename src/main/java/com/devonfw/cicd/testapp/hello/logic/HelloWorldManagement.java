package com.devonfw.cicd.testapp.hello.logic;

import javax.enterprise.context.ApplicationScoped;

/**
 * This is an example business logic class.
 */
@ApplicationScoped
public class HelloWorldManagement {

  /**
   * Returns the String "Hello world!".
   *
   * @return The String "Hello world!".
   */
  public String helloWorld() {

    return "Hello World!";
  }

  /**
   * Return the String "Hello <<name>>!".
   *
   * @param name The name to greet.
   * @return The String "Hello <<name>>!".
   */
  public String helloName(String name) {

    return "Hello " + name + "!";
  }
}
