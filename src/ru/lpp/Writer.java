package ru.lpp;

/**
 * Created by poul on 17.06.2016.
 */
public class Writer {

    private String firstName;
    private String lastName;

    public Writer() {
        firstName = "";
        lastName = "";
    }

    public Writer(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
