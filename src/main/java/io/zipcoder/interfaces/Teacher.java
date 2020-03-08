package io.zipcoder.interfaces;

public interface Teacher {

    public double teach(Learner learner, double numberOfHourse);

    public void lecture(Learner[] learners, double numberOfHours);
}
