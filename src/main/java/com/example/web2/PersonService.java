package com.example.web2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {
    @Autowired
    PersonRepo repo;

    public void add(Person person){
        repo.save(person);
    }
    public List <Person> getAllPersons(){
        //return repo.findAll();
        return null;
    }
}
