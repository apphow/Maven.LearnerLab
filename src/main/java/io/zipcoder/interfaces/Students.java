package io.zipcoder.interfaces;

//final makes class unextendable
public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {

    }

    public static Students getInstnace() {
        return INSTANCE;
    }
}
