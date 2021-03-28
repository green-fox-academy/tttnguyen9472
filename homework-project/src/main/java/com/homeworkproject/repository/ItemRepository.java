package com.homeworkproject.repository;

import com.homeworkproject.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
