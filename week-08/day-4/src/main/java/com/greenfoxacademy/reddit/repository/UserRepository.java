package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
