package com.greenfoxacademy.springsql.repository;

import com.greenfoxacademy.springsql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {


}
