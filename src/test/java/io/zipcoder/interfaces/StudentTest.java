package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student(388L, "April");

    @Test
    public void testImplementation() {
        Student student = new Student(2356L, "April");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(3890L, "Cameron");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        student.learn(100);
        double expected = 100;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(actual, expected, 0);
    }
}