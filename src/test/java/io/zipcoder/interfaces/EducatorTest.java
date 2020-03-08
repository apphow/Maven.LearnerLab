package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    @Test
    public void implementationTest() {
        Educator educator1 = Educator.Nobles;

        Assert.assertTrue(educator1 instanceof Teacher);
    }
    @Test
        public void getNumberOfHoursTaughtTest() {
            Educator educator1 = Educator.Nobles;
            Student student1 = new Student(48L, "John");
            double expected = 20;
            educator1.teach(student1, expected);
            double actual = educator1.timeWorked();
            Assert.assertEquals(expected, actual, 0);

        }


    }

