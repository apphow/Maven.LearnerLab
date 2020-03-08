package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    DOLIO,
    NOBLES,
    ROBERTO,
    FROILAN, Nobles;

    private final Instructor instructor;

    private Double timeWorked = 0.0;

    Educator() {

        this.instructor = new Instructor((long) ordinal(), name());
    }
    public Double timeWorked() {
        return timeWorked;
    }

    @Override
    public double teach(Learner learner, double numberOfHours) {
        timeWorked+=numberOfHours;
        return this.instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        this.instructor.lecture(learners, numberOfHours);

    }
}
