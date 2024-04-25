package com.ru.potapov.cruddemo.entity;

import com.ru.potapov.cruddemo.entity.enums.Currency;

import java.time.LocalDateTime;

public class Account {

    private Long id;
    private String number;
    private Person owner;
    private Currency currency;
    private double sum;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
