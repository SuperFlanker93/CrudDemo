package com.ru.potapov.cruddemo.entity;

import com.ru.potapov.cruddemo.entity.enums.Currency;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Credit {

    private Long id;
    private Currency currency;
    private double bid;
    private double sum;
    private Person client;
    private LocalDate endOfCredit;
    private LocalDate issuedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
