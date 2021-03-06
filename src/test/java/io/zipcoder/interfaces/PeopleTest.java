package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class PeopleTest {
    People personList;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void setUp() throws Exception {
        personList = new People() {
            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Person[] getArray() {
                return new Person[0];
            }
        };
        person1 = new Person(25L, "April");
        person2 = new Person(48L, "Jill");
        person3 = new Person(65L, "Cameron");
    }

    @Test
    public void addTest() {
        personList.add(person1);
        personList.add(person2);

        Integer expected = 2;
        Integer actual = personList.personList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        personList.add(person2);
        personList.add(person3);
        personList.remove(person2);

        Integer expected = 1;
        Integer actual = personList.personList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() {
        personList.add(person3);

        Person expectedByID = personList.findById(65L);
        Person actualById = personList.findById(person3.getId());

        Assert.assertEquals(expectedByID, actualById);
    }

    @Test
    public void contains() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void removeById() {
    }
}