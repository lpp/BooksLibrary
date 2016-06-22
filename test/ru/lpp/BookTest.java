package ru.lpp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by poul on 20.06.2016.
 */
public class BookTest {
    @Test
    public void fullTitle() throws Exception {
        Book book = new Book("Отцы и дети", new Writer("Тургеньев", "Иван") );
        assertEquals("Тургеньев Иван - Отцы и дети", book.fullTitle());
    }

}