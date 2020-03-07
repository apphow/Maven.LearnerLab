package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(2875L, "Chelsea");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(65L, "Brittany");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
       Instructor instructor1 = new Instructor(234L, "Roberto");
       Student student1 = new Student(33L, "April");
       double expectedStudyTime = 25.0;
       instructor1.teach(student1, expectedStudyTime);
       double actualStudyTime = student1.getTotalStudyTime();

       Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
    }

    @Test
    public void testLecture() {
        Instructor instructor1 = new Instructor(265L, "Dolio");
        Student student1 = new Student(35L, "April");
        Student student2 = new Student(678L, "Cameron");

        Learner[] students = {student1, student2};
        instructor1.lecture(students, 48);

        double expectedTime = 24;
        double actualTime = student2.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime, 0);
    }
}