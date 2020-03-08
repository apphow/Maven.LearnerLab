package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> {

   public ArrayList<E> personList = new ArrayList<E>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id){
        for(E person : personList) {
            if(person.getId() == id) {
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

    public void remove(E person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        personList.remove(findById(id));
    }

    public void removeAll(ArrayList<Person> newArrayList) {
        personList.removeAll(newArrayList);
    }
    public int getCount() {
        return personList.size();
    }

    public abstract E [] getArray();

    public void removeAll1() {
        personList.clear();
    }

}