package com.ru.potapov.cruddemo.entity;

import java.time.LocalDateTime;
import java.util.Set;

public class Person {

    private Long id;
    private String name;
    private int age;
    private String city;
    private Set<Account> accounts;
    private Set<Credit> credits;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
