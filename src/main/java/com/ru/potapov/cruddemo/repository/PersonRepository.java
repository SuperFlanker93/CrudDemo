package com.ru.potapov.cruddemo.repository;

import com.ru.potapov.cruddemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
