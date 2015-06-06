package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldDisplayBookList(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("CN", "Stalling", "3Oct1990"));
        Books books = new Books(booksList);
        String expectedList = "Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n";

        String actualList = books.toString();

         assertEquals(expectedList, actualList);
    }

}
