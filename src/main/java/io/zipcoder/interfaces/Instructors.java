package io.zipcoder.interfaces;

import java.util.Iterator;

public final class Instructors extends People<Instructor> {


    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor instructor1 = new Instructor(3899L, "Parker");
        Instructor instructor2 = new Instructor(478L, "Cameron");

        super.add(instructor1);
        super.add(instructor2);
    }

    public static final Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArray() {
        return super.personList.toArray(new Instructor[0]);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
