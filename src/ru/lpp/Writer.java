package ru.lpp;

/**
 * Created by poul on 17.06.2016.
 */
public class Writer {

    private String firstName;
    private String lastName;

    public Writer() {
        this.firstName = "";
        this.lastName = "";
    }

    public Writer(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String fullName() {
        String fn = this.firstName + " " + this.lastName;
        return fn;
    }

}
