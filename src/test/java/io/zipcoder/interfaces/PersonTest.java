package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person1 = new Person(455L, "Apri");

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
        Person person = new Person(455L, "April");
        //@hen;
        String expected = "April";
        person.setName("April");
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void getName() {
        //Given
        Person person = new Person(355L, "Cameron");
        String expected = "Cameron";
        person.setName("Cameron");
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
}