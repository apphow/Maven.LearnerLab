package io.zipcoder.interfaces;

public final class Instructors extends People implements Teacher{


    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
    }

    public static final Instructors getInstance() {
        return INSTANCE;
    }
}
