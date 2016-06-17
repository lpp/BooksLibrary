package ru.lpp;

import java.util.List;

/**
 * Created by poul on 17.06.2016.
 */
public class Book {

    private String title;
    private List<Writer> Writers;
    private String ISBN;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Writer> getWriters() {
        return Writers;
    }

    public void setWriters(List<Writer> writers) {
        Writers = writers;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
