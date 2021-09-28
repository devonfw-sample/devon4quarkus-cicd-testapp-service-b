package com.devonfw.cicd.testapp.hello.logic;

import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface UserMapper {
	
	Dto toResource(User user);
	User fromResource(Dto userDto);
}
