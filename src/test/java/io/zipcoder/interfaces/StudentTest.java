package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student student1 = new Student(145L, "April");
        Assert.assertTrue(student1 instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student1 = new Student(345L, "April");
        Assert.assertTrue(student1 instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student1 = new Student(48959L, "April");
        student1.learn(200);
        double actual = student1.getTotalStudyTime();
        double expected = 200;

        Assert.assertEquals(expected, actual, 0);
    }
}