package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldDisplayBookList(){
    Books books = new Books();
    String expectedList = "OS\nJava\nDb\n";

    String actualList = books.toString();

    assertEquals(expectedList, actualList);
    }

}
