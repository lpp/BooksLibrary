package ru.lpp;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by poul on 17.06.2016.
 */
public class Library {

    private ArrayList<Book> books = new ArrayList();

    public Library() {
    }

    public boolean isEmpty() {
        return this.books.isEmpty();
    }

    public int size() {
        return this.books.size();
    }

    public void addNewBook(Book book) {
        this.books.add(book);
    }

    public void showBooksList() {

        for (Book book:books) {
            System.out.println( book.getId().toString() + " " + book.fullTitle() );
        }

    }

}
