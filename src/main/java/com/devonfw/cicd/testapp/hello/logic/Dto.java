package com.devonfw.cicd.testapp.hello.logic;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Data transfer object class used to map the entities to the database
 * @author hkayed
 *
 */
public class Dto {

	private Long id;
	private String username;
	private String password;
	private String email;

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonIgnore
	public String getPassword() {
		return this.password;
	}
}
