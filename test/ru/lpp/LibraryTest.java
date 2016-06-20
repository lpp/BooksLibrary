package ru.lpp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Poul on 20.06.2016.
 */
public class LibraryTest {
    @Test
    public void isEmpty() throws Exception {
        Library lib = new Library();
        Assert.assertTrue(lib.isEmpty());
    }

    @Test
    public void addNewBook() throws Exception {
        Library lib = new Library();
        Book book = new Book();
        lib.addNewBook(book);
        Assert.assertFalse(lib.isEmpty());
        Assert.assertEquals(1L, (long)lib.size());
    }

}