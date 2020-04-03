package com.features.nullpointer;

import java.time.LocalDate;
import java.time.Month;

class SomeService {

    public Person findPerson() {
        Person person = new Person();
        person.setName("Cristiano Bombazar");
        person.setDateOfBirth(LocalDate.of(1994, Month.DECEMBER, 14));
        return person;
    }
}
