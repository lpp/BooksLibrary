package ru.lpp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Poul on 20.06.2016.
 */
public class WriterTest {
    @Test
    public void fullName() throws Exception {
        Writer writer = new Writer("Пушкин", "А.С.");
        Assert.assertEquals("Пушкин А.С.", writer.fullName());
    }
}