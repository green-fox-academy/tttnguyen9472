package com.greenfoxacademy.rest.repository;

import com.greenfoxacademy.rest.model.sith.SithText;
import org.springframework.data.repository.CrudRepository;

public interface SithRepository extends CrudRepository<SithText, Long> {
}
