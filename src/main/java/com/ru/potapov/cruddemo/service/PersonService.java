package com.ru.potapov.cruddemo.service;

import com.ru.potapov.cruddemo.dto.PersonDto;
import com.ru.potapov.cruddemo.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private  final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonDto getPersonById(){
        return  null;
    }

}
