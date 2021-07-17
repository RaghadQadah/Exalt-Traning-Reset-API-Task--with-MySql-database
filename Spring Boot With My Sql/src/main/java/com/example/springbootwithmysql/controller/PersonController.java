package com.example.springbootwithmysql.controller;

//import com.example.h2demo.model.Person;
//import com.example.h2demo.service.PersonService;
import com.example.springbootwithmysql.model.Person;
import com.example.springbootwithmysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;
    //creating a get mapping that retrieves all the students detail from the database

    @GetMapping("/person")
    private List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/person/{id}")
    private Person getPerson(@PathVariable("id") int id) {
        return personService.getPerosnById(id);
    }

    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/person/{id}")
    private void deletePerson(@PathVariable("id") int id) {
        personService.deletePerson(id);
    }

    //creating post mapping that post the student detail in the database
    @PostMapping("/person")
    private int addPerson(@RequestBody Person person) {
        personService.saveOrUpdate(person);
        return person.getId();
    }

    @PutMapping("/person")
    private int updatePerdon(@RequestBody Person person) {
        personService.saveOrUpdate(person);
        return person.getId();
    }


}
