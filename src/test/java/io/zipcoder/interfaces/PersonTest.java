package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void constructorTest() {
        //Given
        long expected = 24;
        //When
        Person person = new Person(expected);
        long actual = person.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getId() {
        //Given
        long expected = 24;
        //When Person person
        Person person = new Person(expected);
        long actual = person.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        //Given
        long expected = 244;
        //@hen
        Person person = new Person(expected);
        long actual = person.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        //Given
        long id = 244;
        String expected = "April";
        //When
        Person person = new Person(id);
        person.setName(expected);
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
