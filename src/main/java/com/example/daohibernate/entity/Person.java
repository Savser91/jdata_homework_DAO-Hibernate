package com.example.daohibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IdClass(PersonPrimaryKey.class)
@Entity
public class Person {

    @javax.persistence.Id
    private String name;
    @javax.persistence.Id
    private String surname;
    @Id
    private int age;

    @Column
    private String phone_number;
    @Column
    private String city_of_living;

    public Person(String name, String surname, int age, String city_of_living) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city_of_living = city_of_living;
    }
}
