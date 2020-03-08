package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    Instructor instructor;
    Student student1;
    Student student2;

    @Before
    public void testConstructor() {
        instructor = new Instructor(25L, "Dolio");
        student1 = new Student(45L, "April");
        student2 = new Student(46L, "Brittany");
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        instructor.teach(student1, 50);
        double expectedStudyTime = 50;
        double actualStudyTime = student1.getTotalStudyTime();

        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
        System.out.println(expectedStudyTime);
        System.out.println(actualStudyTime);
    }

    @Test
    public void testLecture() {
        Learner[] learners = {student1, student2};
        instructor.lecture(learners, 50);
        double expectedTotalStudyTime = 25;
        double actualTotalStudyTime = student1.getTotalStudyTime();

        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0);
        System.out.println(expectedTotalStudyTime);
        System.out.println(actualTotalStudyTime);
    }
}