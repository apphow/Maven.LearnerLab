package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    Long id;
    Person person = new Person(35L, "April");
    List<Person> personList = new ArrayList<Person>();

    public Iterator<Person> iterator() {
        return personList.iterator();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id){
        for(int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        personList.remove(findById(id));
    }

    public void removeAll() {
        personList.removeAll(personList);
    }
}
