package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByIsDoneTrue();

    List<Todo> findAllByIsDone(Boolean isDone);
}
