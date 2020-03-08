package io.zipcoder.interfaces;

//final makes class unextendable
public final class Students extends People <Student>{

    private static final Students INSTANCE = new Students();
    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getArray() {
        return personList.toArray(new Student[personList.size()]);
    }



}
