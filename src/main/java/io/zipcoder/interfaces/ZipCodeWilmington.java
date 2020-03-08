package io.zipcoder.interfaces;

public class ZipCodeWilmington extends People {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students;
    Instructors instructors;

    private ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public static void hostLecture(Teacher teacher, double numberOfHours) {

    }

    @Override
    public Person[] getArray() {
        return new Person[0];
    }
}

