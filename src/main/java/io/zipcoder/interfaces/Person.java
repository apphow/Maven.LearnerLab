package io.zipcoder.interfaces;

public class Person {
    Person person3;
    final Long id;
    private String name;


    public Person(Long id, String name) {
        this.id = id;
        this.name = "";
    }

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    }


