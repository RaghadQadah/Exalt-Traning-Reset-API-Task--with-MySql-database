package com.example.springbootwithmysql.service;

import com.example.springbootwithmysql.model.Person;
import com.example.springbootwithmysql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {


    @Autowired
    PersonRepository personRepo;

    public List<Person> getAllPerson() {
        List<Person> personList = new ArrayList<Person>();
        personRepo.findAll().forEach(person -> personList.add(person));
        return personList;
    }

    //getting a specific record
    public Person getPerosnById(int id) {
        return personRepo.findById(id).get();
    }

    public void saveOrUpdate(Person person) {
        personRepo.save(person);
    }

    //deleting a specific record
    public void deletePerson(int id) {
        personRepo.deleteById(id);

    }


}
