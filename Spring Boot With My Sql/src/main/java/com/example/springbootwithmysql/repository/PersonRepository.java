package com.example.springbootwithmysql.repository;

import com.example.springbootwithmysql.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
