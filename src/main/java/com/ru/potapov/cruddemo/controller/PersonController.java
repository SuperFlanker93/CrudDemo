package com.ru.potapov.cruddemo.controller;

import com.ru.potapov.cruddemo.dto.PersonDto;
import com.ru.potapov.cruddemo.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {


    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    public PersonDto getPersonById (){
        return null;
    }

}
