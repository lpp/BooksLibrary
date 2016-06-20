package ru.lpp;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private ArrayList<Writer> writers;
    private String ISBN;

    Book() {
        this.title = "";
        this.writers = new ArrayList();
    }

    Book(String title, ArrayList<Writer> writers) {
        this.title = title;
        this.writers = writers;
    }

    Book(String title, Writer writer) {
        this.title = title;
        this.writers = new ArrayList();
        this.writers.add(writer);
    }

    public String fullTitle() {
        String authors = "";

        for (Writer wr : writers ) {
            authors = authors + wr.fullName() + " ";
        }
        return authors + "- " + this.title;
    }
}

