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
            try {
                System.out.println(book.getId().toString() + " " + book.fullTitle());
            } catch (NullPointerException ex) {
                //System.out.println(book.fullTitle());
            }
        }

    }

    Library SearchByTitle(String title ){

        Library libResult  = new Library();
        for (Book book:books) {
            try {
                if (book.fullTitle().contains(title)) {
                    libResult.addNewBook(book);
                }
            } catch (NullPointerException ex) {
                throw ex;
            }
        }
        return libResult;
    };



}
