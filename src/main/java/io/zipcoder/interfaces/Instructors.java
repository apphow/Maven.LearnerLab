package io.zipcoder.interfaces;

public final class Instructors extends People implements Teacher{


    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
    }

    public static final Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Person[] getArray() {
        return new Person[0];
    }

    @Override
    public double teach(Learner learner, double numberOfHourse) {
        return 0;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
