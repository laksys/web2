package com.example.web2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/p")
public class PersonController {
    @Autowired
    PersonService service;

    @PostMapping
    public void addPerson(@RequestBody Person person){
        service.add(person);
    }
    @GetMapping
    public List<Person> getPersons(){
        return null;
    }
}
