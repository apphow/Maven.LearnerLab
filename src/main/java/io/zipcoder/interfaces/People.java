package io.zipcoder.interfaces;

import java.util.List;

public class People {
    List<Person> personList;

    public void add(Person person) {
        personList.add(person);
    }
}
