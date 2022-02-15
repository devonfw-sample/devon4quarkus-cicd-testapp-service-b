package com.devonfw.cicd.testapp.hello.domain.repo;

import org.springframework.data.repository.CrudRepository;

import com.devonfw.cicd.testapp.hello.domain.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
