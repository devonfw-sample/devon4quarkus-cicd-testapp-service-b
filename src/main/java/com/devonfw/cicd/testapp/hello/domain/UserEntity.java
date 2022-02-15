package com.devonfw.cicd.testapp.hello.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hello_user")
public class UserEntity extends ApplicationPersistenceEntity {

  private String firstname;

  private String lastname;

}