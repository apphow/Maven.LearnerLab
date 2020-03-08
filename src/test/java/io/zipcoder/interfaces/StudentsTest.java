package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void test() {
        Students instance1 = Students.getInstance();
        Students instance2 = Students.getInstance();

        instance1.add(new Student(100L, "Brittany"));
        instance2.add(new Student(200L, "Parker"));

        instance1.findById(100L).setName("Apple");

        Assert.assertSame(instance1, instance2);

    }

}